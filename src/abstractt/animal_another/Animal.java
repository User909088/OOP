package abstractt.animal_another;
abstract class Does{
    public abstract void eat();
    public abstract void sleep();
}

//subclasses
class Lion extends Does{
    @Override
    public void eat() {
        System.out.println("Gorges after hunt, eats large prey, dominant members eat first");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 16–20 hrs/day, often in groups, rests during day");
    }
}

class Tiger extends Does{
    @Override
    public void eat() {
        System.out.println("Hunts alone, eats large chunks, may drag prey to hide from others");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 12–16 hrs/day, solitary, rests in shade");
    }
}

class Deer extends Does{
    @Override
    public void eat() {
        System.out.println("Grazes quietly, eats plants, often cautious and alert while feeding");
    }

    @Override
    public void sleep() {
        System.out.println("Light sleeper, sleeps a few hours/day, often alert");
    }
}

public class Animal {
    public static void main(String[] args) {
        Does l = new Lion();
        Does t = new Tiger();
        Does d = new Deer();

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
