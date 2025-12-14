package encapsulation.person;
class Person{
    private String name;
    private int age;
    private String country;
    //getters
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    //setters


    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        p.setAge(22);
        p.setName("John");
        p.setCountry("US");

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Country: " + p.getCountry());

    }
}
