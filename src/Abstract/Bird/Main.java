package Abstract.Bird;


abstract class Bird {

   public abstract void fly();
    public abstract void makeSound();
}


class Eagle extends Bird {
    @Override
  public   void fly() {
        System.out.println("Eagle flies high in the sky with powerful wings.");
    }

    @Override
  public   void makeSound() {
        System.out.println("Eagle makes a loud screeching sound.");
    }
}


class Hawk extends Bird {
    @Override
public void fly() {
        System.out.println("Hawk soars swiftly and dives quickly to catch prey.");
    }

    @Override
 public    void makeSound() {
        System.out.println("Hawk makes a sharp, piercing call.");
    }
}


public class Main {
    public static void main(String[] args) {
        Bird my = new Eagle();
        Bird m = new Hawk();

        System.out.println("Eagle Behavior:");
        my.fly();
        my.makeSound();

        System.out.println("\nHawk Behavior:");
        m.fly();
        m.makeSound();
    }
}
