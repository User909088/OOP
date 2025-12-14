package abstractt.Vehicle;

//super
abstract class Vehicle{
    public abstract void start_Engine();
    public abstract void stop_Engine();
}

//subclass
class Car extends Vehicle{
    @Override
    public void start_Engine() {
        System.out.println("Car: Starting engine...");

    }

    @Override
    public void stop_Engine() {
        System.out.println("Car: Stopping engine...");

    }
}

class Motorcycle extends Vehicle{
    @Override
    public void start_Engine() {
        System.out.println("Motorcycle: Starting engine...");
    }

    @Override
    public void stop_Engine() {
        System.out.println("Motorcycle: Stopping engine...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle m = new Motorcycle();

        c.start_Engine();
        c.stop_Engine();

        System.out.println("----------------------------------");

        m.start_Engine();
        m.stop_Engine();


    }
}
