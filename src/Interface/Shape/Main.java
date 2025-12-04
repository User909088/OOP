package Interface.Shape;


interface Shape{
    double getArea();
}

class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}

class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12, 9);
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(6, 8);
        System.out.println("Rectangle area: " + rectangle.getArea() );
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
    }
}
