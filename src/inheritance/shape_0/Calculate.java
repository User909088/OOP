package inheritance.shape_0;
//super
class Shape{
    public double getPerimeter(){
        return 0.0;
    }

    public double getArea(){
        return  0.0;
    }
}

//child

class  Circle extends Shape{
    static double pi = 3.14;
    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() + 2 * r * pi;
    }

    @Override
    public double getArea() {
        return super.getArea() + Math.pow(r, 2) * pi;
    }
}



public class Calculate {
    public static void main(String[] args) {
     Circle c = new Circle(12);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
    }
}
