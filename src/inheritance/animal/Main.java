package inheritance.animal;

class Animal {
    public void make_sound() {
        System.out.println("Make sound");
    }
}
    class Cat extends Animal {
        @Override
        public void make_sound() {
            System.out.println("meow");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal a = new Animal();
            Cat c = new Cat();
           a.make_sound();
           c.make_sound();

        }
    }


