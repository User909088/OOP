package Nested_class.inner_class_with_constructor;

public class Person {
    class Address {
        private String city;
        private String state;

        public Address(String city, String state){
            this.city = city;
            this.state = state;
        }

        void add(){
            System.out.println("City: " + city + "\n" + "State: " + state );
        }
    }

    public static void main(String[] args) {
        Person s = new Person();
        Person.Address r = s.new Address("I dont", "Know");

        r.add();
    }
}
