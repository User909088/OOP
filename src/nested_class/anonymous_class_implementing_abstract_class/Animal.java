package nested_class.anonymous_class_implementing_abstract_class;

abstract class Animal {
    abstract void make_sound();

    public static void main(String[] args) {
        Animal l = new Animal() {
            @Override
            void make_sound() {
                System.out.println("meow");
            }
        };
        l.make_sound();
    }

}
