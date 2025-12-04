package Nested_class.Anonymous_Exe;

public interface Greeting {
    void say_hello();

    public static void main(String[] args) {
        Greeting gr = new Greeting() {
            @Override
            public void say_hello() {
                System.out.println("Hello World");
            }
        };
        gr.say_hello();
    }
}
