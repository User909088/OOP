package Abstract.Shape_3D;
//super
abstract class Shape_3D{
    public abstract double calculate_Volume();
    public abstract double calculate_Surface_Area();
}

//subclass

class Sphere extends Shape_3D{
    private double radius;

    public  Sphere(double radius){
        this.radius = radius;
    }
    @Override
    public double calculate_Surface_Area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculate_Volume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}

class Cube extends Shape_3D{
    private double a;

    public Cube(double a){
        this.a = a;
    }
    @Override
    public double calculate_Surface_Area() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public double calculate_Volume() {
        return Math.pow(a, 3);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape_3D s = new Sphere(7);
        Shape_3D c = new Cube(5);
        System.out.println("-----------------------------");
        System.out.printf("Area of the Sphere: %.2f\n", s.calculate_Surface_Area());
        System.out.printf("Volume of the Sphere: %.2f\n", s.calculate_Volume());

        System.out.println("-----------------------------");
        System.out.printf("Area of the Cube: %.2f\n", c.calculate_Surface_Area());
        System.out.printf("Volume of the Cube: %.2f\n", c.calculate_Volume());

        System.out.println("-----------------------------");

    }
}
