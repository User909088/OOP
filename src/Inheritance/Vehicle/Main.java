package Inheritance.Vehicle;

class Vehicle {
    public void drive(){
        System.out.println("Override it");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing car");
    }
}



public class Main {
    public static void main(String[] args) {
        Vehicle c = new Car();
    c.drive();
    }
}
