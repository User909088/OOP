package Abstract.Person;
//super
abstract class Person{
    public abstract void eat();
    public abstract void exercise();
}

//child

class Lazy_Person extends Person{
    @Override
    public void eat() {
        System.out.println("Eats more junk or unplanned meals.");
    }

    @Override
    public void exercise() {
        System.out.println("Rarely exercises or stays consistent.");
    }
}

class Athlete extends Person{
    @Override
    public void eat() {
        System.out.println("Eats balanced, high-protein meals.");
    }

    @Override
    public void exercise() {
        System.out.println("Trains regularly and intensely");
    }
}

    public class Main {
         public static void main(String[] args) {
    Person l = new Lazy_Person();
    Person a = new Athlete();
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
