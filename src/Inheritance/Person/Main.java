package Inheritance.Person;

import javax.sound.midi.Soundbank;

//super class
class Person {
    private String first_name;
    private String last_name;


    //constructor
    public Person(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

    //getters

    public String getFirst_name(){
        return first_name;
    }

    public String getLast_name(){
        return last_name;
    }

}

    //child class
   class Employee extends Person{
        private int employee_id;
        private String job_title;

        public Employee(String first_name, String last_name, int employee_id, String job_title){
            super(first_name, last_name);
            this.employee_id = employee_id;
            this.job_title = job_title;
        }

        public int getEmployee_id() {
            return employee_id;
        }

        public String getJob_title() {
            return job_title;
        }


        @Override
        public String getLast_name() {
            return super.getLast_name() + "\n" + job_title;
        }
    }
    //Main class
public class Main {
    public static void main(String[] args) {
        Employee em = new Employee("Tom", "Zack", 80004269, "Marketing Maneger");
        System.out.println("First Name: " + em.getFirst_name());
        System.out.println("Second : " + em.getLast_name());
        System.out.println("EmployeeId:" + em.getEmployee_id());


    }
}
