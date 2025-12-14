package encapsulation.rectangle;
class Rectangle{
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

public class Shape {
    public static void main(String[] args) {
        Rectangle get = new Rectangle();

        get.setHeight(4);
        get.setWidth(2);

        System.out.println("Width: " + get.getWidth());
        System.out.println("Height " + get.getHeight());
    }
}
