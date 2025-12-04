package Interface.Flyable;

interface Flyable{
    void fly_obj();
}

class Spacecraft implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("flying 234km/mls");
    }
}
class Helicopter implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Delivering food to villa");
    }
}
class Airplane implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("not flying , waiting for passengers");
    }
}
public class Main {
    public static void main(String[] args) {
        Flyable s = new Spacecraft();
        Flyable a = new Airplane();
        Flyable h = new Helicopter();

        s.fly_obj();
        a.fly_obj();
        h.fly_obj();
    }
}
