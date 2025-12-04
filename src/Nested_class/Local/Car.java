package Nested_class.Local;

public class Car {
    void start_engine(){
        class Engine{
            void run(){
                System.out.println("Engine is running");
            }
        }
        Engine en = new Engine();
        en.run();
    }

    public static void main(String[] args) {
        Car s = new Car();
        s.start_engine();
    }
}
