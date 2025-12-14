package encapsulation.car;
class Car{
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public double getMileage() {
        return mileage;
    }

    public int getYear() {
        return year;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car go = new Car();

        go.setCompany_name("Tesla");
        go.setYear(2023);
        go.setModel_name("Model 3");

        System.out.println("Company Name: " + go.getCompany_name());
        System.out.println("Year: " + go.getYear());
        System.out.println("Model: " + go.getModel_name());
        System.out.println("Mileage: " + go.getMileage());

    }
}
