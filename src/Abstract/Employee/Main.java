package Abstract.Employee;
//super
abstract class Employee{
    private String name;
    private double base_salary;

    public Employee(String name, double base_salary){
        this.base_salary = base_salary;
        this.name = name;
    }

    public double getBase_salary() {
        return base_salary;
    }

    public String getName() {
        return name;
    }

    public abstract double calculate_salary();
    public abstract void display_info();
}

//sub

class Manager extends Employee{
    private double bonus;
    private double h_r_a_percentage;
    public Manager(String name, double base_salary, double bonus, double h_r_a_percentage){
        super(name, base_salary);
        this.bonus = bonus;
        this.h_r_a_percentage = h_r_a_percentage;
    }


    public double getH_r_a() {
        double base = getBase_salary();
        return (base * h_r_a_percentage / 100)  ;
    }

    @Override
    public double calculate_salary() {
        double base = getBase_salary();
        return getH_r_a() + bonus + base ;

    }

    @Override
    public void display_info() {
        System.out.println("Name: " + getName());
        System.out.println("Base Salary: $" + getBase_salary());
        System.out.println("HRA Bonus: $" + getH_r_a());
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculate_salary());
    }
}

class Programmer extends Employee{
    private int overtime_hours;
    private double hourly_rate;

    private double bonus;
    private double h_r_a_percentage;
    public Programmer(String name, double base_salary, double bonus, double h_r_a_percentage, int overtime_hours, double hourly_rate){
        super(name, base_salary);
        this.bonus = bonus;
        this.h_r_a_percentage = h_r_a_percentage;
        this.overtime_hours =  overtime_hours;
        this.hourly_rate = hourly_rate;
    }


    public double getOver_Time_Salary() {
        return overtime_hours * hourly_rate;
    }


    public double getH_r_a() {
        double base = getBase_salary();
        return base * h_r_a_percentage / 100;
    }

    @Override
    public double calculate_salary() {
        double base = getBase_salary();
        return getH_r_a() + bonus + getOver_Time_Salary() + base ;

    }

    @Override
    public void display_info() {
        System.out.println("Name: " + getName());
        System.out.println("Base Salary: $" + getBase_salary());
        System.out.println("HRA Bonus: $" + getH_r_a());
        System.out.println("Bonus: $" + bonus);
        System.out.println("Over_time_salary: $" + getOver_Time_Salary());
        System.out.println("Total Salary: $" + calculate_salary());

    }
}



public class Main {
    public static void main(String[] args) {
        Employee manage = new Manager("Mark", 750, 240, 20);
        Employee program = new Programmer("Tony", 800, 200, 20,26, 40);
        System.out.println("-------------------------------------");
        manage.display_info();

        System.out.println("-------------------------------------");
        program.display_info();

        System.out.println("-------------------------------------");
    }
}
