package zO_OP.Person;
class Person{
    private String name;
    private int age;
    private static int counter = 0;

    public Person(String name, int age){
        this.name = name;
        setAge(age);
        counter++;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else
            throw new IllegalArgumentException("Age can't be negative");

    }

    public static int getCounter() {
        return counter;
    }

    public void compare_Ages(Person other){
        if (this.age > other.age){
            System.out.println(this.name + " older than " + other.name);
        }
        else if (other.age > this.age){
            System.out.println(other.name + " is older than " + this.name);
        }
        else
            System.out.println(this.name + " and " + other.name + " Both are same age");
    }
}

class P_Address extends Person implements Cloneable{
    private String address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public P_Address(String name, int age, String address){
        super(name, age);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void compare_Ages(Person other) {
        super.compare_Ages(other);
    }

    public boolean same_Address(P_Address other_address){
        if (other_address == null){
            return false;
        }
        return this.address.equalsIgnoreCase(other_address.getAddress());
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person p = new Person("Amir", 24);
        Person p2 = new Person("John", 18);
        P_Address p3 = new P_Address("Can", 19, "New Street");
        P_Address p4 = new P_Address("Tess", 19, "New Street");
        P_Address p5 = (P_Address) p3.clone();
        System.out.println("Name: " + p.getName() + "\n" + "Age: " + p.getAge());
        System.out.println();
        System.out.println("Name: " + p2.getName() + "\n" + "Age: " + p2.getAge());
        System.out.println();
        System.out.println("Name: " + p3.getName() + "\n" + "Age: " + p3.getAge() + "\n" + "Address " + p3.getAddress());
        System.out.println();
        System.out.println("Name: " + p4.getName() + "\n" + "Age: " + p4.getAge() + "\n" + "Address " + p4.getAddress());
        System.out.println();
        System.out.println("Name: " + p5.getName() + "\n" + "Age: " + p5.getAge() + "\n" + "Address " + p5.getAddress());
        System.out.println();
        p2.compare_Ages(p);
        p3.compare_Ages(p4);

        System.out.println();
        System.out.println(p3.getName() + " and " + p4.getName() + " lives in the same address? " + p3.same_Address(p4));
        System.out.println();

        System.out.println("Created: " + Person.getCounter());

    }
}
