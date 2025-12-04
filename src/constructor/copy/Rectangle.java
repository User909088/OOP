package constructor.copy;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(Rectangle other){
        this.width = other.width;
        this.length = other.length;
    }

    public  Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(234.32, 123);
        Rectangle r1 = new Rectangle(r);

        System.out.println("Original: w: " + r.width);
        System.out.println("Original: l: " + r.length);
        System.out.println(">copy: w: " + r1.width);
        System.out.println(">copy: l: " + r1.length);
    }
}



