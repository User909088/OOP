package inheritance.vehicle_0;

//super
class Vehicle{
    private double time;
    private    double used_fuel;
    private  double distance;


    //constructor

    public Vehicle( double distance, double used_fuel, double time){
        this.distance = distance;
        this.used_fuel = used_fuel;
        this.time = time;
    }

    //getters
    public  double getFuel_Efficiency(){
        return distance / used_fuel ;
    }


    public  double getMax_speed(){
        return distance / time;
    }
//methods

}


//child
class Truck extends Vehicle{
    public Truck(double distance, double used_fuel, double time){
        super(distance, used_fuel, time);
    }
    @Override
    public double getFuel_Efficiency() {
        return super.getFuel_Efficiency();
    }



    @Override
    public double getMax_speed() {
        return super.getMax_speed();
    }
}

class Car extends Vehicle{
    public Car(double distance, double used_fuel, double time) {
        super(distance, used_fuel, time);
    }

    @Override
    public double getFuel_Efficiency() {
        return super.getFuel_Efficiency();
    }

    @Override
    public double getMax_speed() {
        return super.getMax_speed();
    }
}

class Motorcycle extends Vehicle{
    public Motorcycle(double distance, double used_fuel, double time){
        super(distance, used_fuel, time);
}
    @Override
    public double getFuel_Efficiency() {
        return super.getFuel_Efficiency();
    }



    @Override
    public double getMax_speed() {
        return super.getMax_speed();
    }
}
public class Main {
    public static void main(String[] args) {
        Truck t = new Truck(240,24, 24);
        Car c = new Car(130, 14, 5);
        Motorcycle m = new Motorcycle(60, 3.7, 1);

        System.out.println("Truck: " + "\n" + "  Fuel Efficiency: " + t.getFuel_Efficiency() + "\n" + "  Max_speed: " + t.getMax_speed());
        System.out.println("Car: " + "\n" + "  Fuel Efficiency: " + c.getFuel_Efficiency() + "\n" + "  Max_speed: " + c.getMax_speed());
        System.out.println("Motorcycle: " + "\n" + "  Fuel Efficiency: " + m.getFuel_Efficiency() + "\n" + "  Max_speed: " + m.getMax_speed());
    }
}
