package Abstract.Animal_0;
abstract class Animal{
    public abstract void eat();
    public abstract void sleep();
}

//subclasses
class Lion extends Animal{
    @Override
    public void eat() {
        System.out.println("Gorges after hunt, eats large prey, dominant members eat first");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 16–20 hrs/day, often in groups, rests during day");
    }
}

class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("Hunts alone, eats large chunks, may drag prey to hide from others");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 12–16 hrs/day, solitary, rests in shade");
    }
}

class Deer extends Animal{
    @Override
    public void eat() {
        System.out.println("Grazes quietly, eats plants, often cautious and alert while feeding");
    }

    @Override
    public void sleep() {
        System.out.println("Light sleeper, sleeps a few hours/day, often alert");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal l = new Lion();
        Animal t = new Tiger();
        Animal d = new Deer();

        System.out.println("Lion: ");
        l.eat();
        l.sleep();
                System.out.println();
        System.out.println("Tiger: ");
        t.eat();
        t.sleep();
                 System.out.println();
        System.out.println("Deer: ");
        d.eat();
        d.sleep();

    }
}
