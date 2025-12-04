package Encapsulation.House;
class House{
    private String address;
    private double Area;
    private int number_Of_Rooms;

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public int getNumber_Of_Rooms() {
        return number_Of_Rooms;
    }

    public void setNumber_Of_Rooms(int number_Of_Rooms) {
        this.number_Of_Rooms = number_Of_Rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double Price(double per){
        return per * getArea();
    }
}

public class Main {
    public static void main(String[] args) {
        House h = new House();

        h.setAddress("123 Oak Street, Springfield, IL");
        h.setNumber_Of_Rooms(5);
        h.setArea(2500);


        System.out.println("Address: " + h.getAddress());
        System.out.println("Rooms: " + h.getNumber_Of_Rooms());
        System.out.println("Area: " + h.getArea());
        System.out.println("Price: " + h.Price(150) + "$");
    }
}
