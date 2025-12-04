package Encapsulation.Product;

class Product{
    private String product_Name;
    private String product_Code;
    private double product_Price;

    public double getProduct_Price() {
        return product_Price;
    }

    public void setProduct_Price(double product_Price) {
        this.product_Price = product_Price;
    }

    public String getProduct_Code() {
        return product_Code;
    }

    public void setProduct_Code(String product_Code) {
        this.product_Code = product_Code;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public void apply_Discount(double percentage){
        if (percentage < 100 && percentage > 0){
            this.product_Price -=  product_Price * percentage / 100;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        p.setProduct_Name("Wireless Bluetooth Headphones");
        p.setProduct_Code("WH-1200B");
        p.setProduct_Price(99.99);

        System.out.println("initial price:" + p.getProduct_Price() + "$");
        System.out.println();
        p.apply_Discount(10);
        p.apply_Discount(50);

        System.out.println("Name: " + p.getProduct_Name());
        System.out.println("Code: " + p.getProduct_Code());
        System.out.println("Price: " + p.getProduct_Price());

    }
}
