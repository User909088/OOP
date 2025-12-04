package constructor.parameterized;

public class Dog {
    private final String name;
    private final String colour;
    private final boolean trained;
    private final String breed;
    private int barkCount;

    public Dog(String name, String colour, boolean trained, String breed){
        this.name = name;
        this.colour = colour;
        this.trained = trained;
        this.breed = breed;
        this.barkCount = 0;
    }

    public String getName(){
        return name;
    }

    public String getColour(){
        return colour;
    }


    public int getBark(){
        barkCount++;
        System.out.println("Woof!");
        return barkCount;
    }

    public boolean isTrained() {
        return trained;
    }

    public static boolean sameColour(Dog my1, Dog my2){
        return my1.colour.equalsIgnoreCase(my2.colour);
    }

    public  boolean isLargeBreed(){
        String[] larges = {"Beauceron", "Azawakh", "Akita", "Malinois", "Laekinois"};
        for (String i : larges) {
            if (breed.equalsIgnoreCase(i)) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        Dog my1 = new Dog("Scar", "green", true, "Husky");
        Dog my2 = new Dog("Boo", "black",true, "Beauceron" );
        System.out.println("Its name: " + my1.getName());
        System.out.println("its colour: " + my1.getColour());

        my1.getBark();
        my1.getBark();
        System.out.println("It barked " + my1.getBark() + " times");

        System.out.println("Colour:" + Dog.sameColour(my1, my2));

        System.out.println("Large breed: " + my1.isLargeBreed());
        System.out.println("Large breed2: " + my2.isLargeBreed());

        System.out.println("Trained?: " + my1.isTrained());
        System.out.println("Trained2?: " + my2.isTrained());
    }
}
