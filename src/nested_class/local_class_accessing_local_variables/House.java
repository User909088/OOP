package nested_class.local_class_accessing_local_variables;

public class House {
    public double a = 4.5;
    public  double b = 7.7;
    void calculate_area(){
         class Room {
             public double getArea() {
                 return a * b;
             }
         }
         Room room = new Room();
         double area = room.getArea();
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        House home = new House();
        home.calculate_area();
    }
}
