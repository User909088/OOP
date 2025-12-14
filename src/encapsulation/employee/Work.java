package encapsulation.employee;


class Employee{
    private String employee_name;
    private double salary;
    private int employee_id;

    public String getEmployee_name() {
        return employee_name;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}



public class Work {
    public static void main(String[] args) {
        Employee info = new Employee();

        info.setEmployee_id(89958585);
        info.setSalary(800);
        info.setEmployee_name("John");

        System.out.println("Employee Info");
        System.out.println("Name: " + info.getEmployee_name());
        System.out.println("Employee id: " + info.getEmployee_id());
        System.out.println("Salary: " + info.getSalary());
    }
}

