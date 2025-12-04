package Inheritance.Employee;
class Employee {
    void work(){
        System.out.println("go");
    }

    void get_salary(){
        System.out.println("No salary for you");
    }
}

class HR_Manager extends Employee {
    @Override
    void work() {
        super.work();
    }

    @Override
    void get_salary() {
        super.get_salary();
    }

    void add_employee(){
        System.out.println("Yeah");
    }
}


public class Main {
    public static void main(String[] args) {
        HR_Manager me = new HR_Manager();
        me.add_employee();
        me.get_salary();
        me.work();
    }
}
