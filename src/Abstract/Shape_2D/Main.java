package Abstract.Shape_2D;

abstract class Shape{
    public abstract void draw();
    public abstract void resize();
}

class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle is being drew");
    }

    @Override
    public void resize() {
        System.out.println("it is being resized");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle is being...");
    }

    @Override
    public void resize() {
        System.out.println("It is being resized");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        Shape c = new Circle();

        r.draw();
        r.resize();

        c.draw();
        c.resize();
    }
}
