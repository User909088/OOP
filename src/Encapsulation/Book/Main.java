package Encapsulation.Book;

class Book{
    private String title;
    private String author;
    private double price;

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void apply_Discount(double percentage){
        if (percentage <= 100 && percentage > 0)
           this.price = this.price - this.price * percentage / 100;
    }


}

public class Main {
    public static void main(String[] args) {
        Book d = new Book();

        d.setAuthor("Alex Michaelides");
        d.setTitle("The Silent Patient");
        d.setPrice(14.99);
        d.apply_Discount(10);

        System.out.println("Title: " + d.getTitle());
        System.out.println("Author: " + d.getAuthor());
        System.out.println("Price with Discount: " + d.getPrice());

    }
}
