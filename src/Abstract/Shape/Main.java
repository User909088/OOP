package Abstract.Shape;
abstract class Shape{
    public abstract void calculate_area();
    public abstract void calculate_perimeter();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void calculate_perimeter() {
        System.out.println("Perimeter of circle" + 2 * Math.PI * radius);
    }

    @Override
    public void calculate_area() {
        System.out.println("Area of the circle" + Math.pow(radius, 2) * Math.PI);
    }
}

class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void calculate_perimeter() {
        System.out.println("Perimeter of triangle  " + (a + b + c));
    }

    @Override
    public void calculate_area() {
        double s = (a + b + c)/2;
        double area =  Math.sqrt(s * (s - a) * (s - b) * (s - c) );
        System.out.println("Area of Triangle  " +  area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(10);
        c.calculate_area();
        c.calculate_perimeter();

        Shape t = new Triangle(12, 14, 23);
        t.calculate_perimeter();
        t.calculate_area();
    }
}