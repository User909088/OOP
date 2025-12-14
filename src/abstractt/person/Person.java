package abstractt.person;
//super
abstract class People{
    public abstract void eat();
    public abstract void exercise();
}

//child

class Lazy_Person extends People{
    @Override
    public void eat() {
        System.out.println("Eats more junk or unplanned meals.");
    }

    @Override
    public void exercise() {
        System.out.println("Rarely exercises or stays consistent.");
    }
}

class Athlete extends People{
    @Override
    public void eat() {
        System.out.println("Eats balanced, high-protein meals.");
    }

    @Override
    public void exercise() {
        System.out.println("Trains regularly and intensely");
    }
}

    public class Person{
         public static void main(String[] args) {
    People l = new Lazy_Person();
    People a = new Athlete();
             System.out.println("==================================");
             System.out.println("Athlete: ");
             a.eat();
             a.exercise();

             System.out.println("==================================");
             System.out.println("Lazy Person: ");
             l.eat();
             l.exercise();

             System.out.println("==================================");

    }
}
