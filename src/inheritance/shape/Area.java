package inheritance.shape;

class Shape {
  public void get_Area(){
  }
}

class Rectangle  extends Shape {
  private int a;
  private int b;

  public Rectangle(int a, int b){
      this.a = a;
      this.b = b;
  }

    @Override
    public void get_Area() {
        System.out.println("Rectangle:" + (a * b));
    }
}

public class Area {
    public static void main(String[] args) {
      Rectangle r = new Rectangle(2 , 12);
      r.get_Area();
    }
}
