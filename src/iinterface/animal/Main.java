package iinterface.animal;

interface Animal{
    void bark();
}

class Dog implements Animal{
    @Override
    public void bark() {
        System.out.println("it i s barking");
    }
}

public class Main {
    public static void main(String[] args) {
Animal barks = new Dog();
barks.bark();
    }
}
