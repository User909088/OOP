package constructor.default_constructor;
import java.lang.String;


public class Cat{
   private String name;
   private float age;
   private String breed;
   private float weight;

     public Cat() {
   this.name = "Unknown";
   this.age = 0F;
   this.breed = "Savannah";
   this.weight = 0.3F;
    }
   //getters
    public String getName(){
        return name;
    }

    public float getAge(){
         return age;
    }

    public String getBreed() {
        return breed;
    }

    public float getWeight(){
         return weight;
    }

    //setters
    public void setName(String name){
         this.name = name;
    }

    public void setAge(float age){
         this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean Kitten(){
         return age < 1.0;
    }

    public static Cat old(Cat m1, Cat m2){

         return(m1.age > m2.age) ? m1 : m2;
    }
   

    
    public static Cat young(Cat m1, Cat m2){
        return(m1.age < m2.age) ? m1 : m2;
    }


    public static void main(String[] args) {
    Cat my1 = new Cat();
    Cat my3= new Cat();

    my1.setName("Byr");
    my1.setAge(0.5F);
    my1.setBreed("idk1");
    my1.setWeight(0.5F);

    my3.setName("BWEEr");
    my3.setAge(0.8F);
    my3.setBreed("idk11");
    my3.setWeight(0.4F);


        System.out.println("Name: " + my1.getName());
        System.out.println("Name2: " + my3.getName());
        System.out.println("Age: " + my1.getAge());
        System.out.println("Age1: " + my3.getAge());
        System.out.println("Weight: " + my1.getWeight());
        System.out.println("Weight2: " + my3.getWeight());
        System.out.println("Breed: " + my1.getBreed() );
        System.out.println("Bread2: " + my3.getBreed());


        if(my1.Kitten() && my3.Kitten()){
            System.out.println("Both are kitten");
        }
        else
            System.out.println("one isn't kitten");

        Cat old =  Cat.old(my1, my3);
        System.out.println("Old one: " + old.getAge());

        Cat young =  Cat.young(my1, my3);
        System.out.println("Young one: " + young.getAge());
    }


}
