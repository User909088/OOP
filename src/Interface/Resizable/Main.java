package Interface.Resizable;

//super

interface Resizable{
    void resize_Width(int width);
    void resize_Height(int height);
}

//subclass

class Rectangle implements Resizable{
    private int width;
    private int height;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void resize_Width(int width) {
        this.width = width;
    }

    @Override
    public void resize_Height(int height) {
        this.height = height;

    }
    public void print_Size(){
        System.out.println("Height " + height + ",Width: " + width);
    }
}

public class Main {
    public static void main(String[] args) {
   Rectangle r = new Rectangle(412, 123);
        r.print_Size();
        r.resize_Height(654);
        r.resize_Width(100);
        r.print_Size();
    }
}
