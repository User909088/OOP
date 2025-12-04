package Encapsulation.Circle;
class Circle{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double Area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double Perimeter(){
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle find = new Circle();

        find.setRadius(10);

        System.out.println("Radius: " + find.getRadius());
        System.out.println("Area: " + find.Area());
        System.out.println("Perimeter: " + find.Perimeter());

    }
}
