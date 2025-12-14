package nested_class.inner;

public class Computer {
    static class Processor{
        void displayDetails(){
            System.out.println("Speed: 12\n" + "Brand: Lenovo");
        }
    }

    public static void main(String[] args) {
        Computer.Processor call = new Processor();
        call.displayDetails();
    }
}
