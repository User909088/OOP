//package constructor.constructorOverloading;
//
//public class Book {
//    private float price;
//    private String title;
//    private String author;
//    private float discount;
//    private boolean bestseller;
//    private int[] rating;
//
//        //Rating
//
//
//    public Book(String title, String author, float price, boolean bestseller, int[] rating){
//      this.title = title;
//      this.author = author;
//      this.price = price;
//      this.discount = 5.0F;
//      this.bestseller = bestseller;
//      this.rating = rating;
//    }
//
//         //setters
//    public void setDiscount(float discount) {
//        if(discount < 0 || discount > 45){
//            throw new RuntimeException("it isn't valid");
//        }
//        this.discount = discount;
//    }
//
//    //getters
//    public String getTitle(){
//        return title;
//    }
//
//    //bestseller
//    public boolean isBestseller(){
//        return bestseller;
//    }
//
//    public String getAuthor(){
//        return author;
//    }
//
//    public float getPrice(){
//        return price;
//    }
//
//    public Book(){
//        this.title = "Unknown";
//        this.author =  "Unknown";
//        this.price = 0.0F;
//        this.discount = 4F;
//    }
//
//    public void info(){
//        System.out.println("Discount:" + discount);
//    }
//
//    //compare prices
//
//    public static Book compared(Book book, Book book1){
//        return (book.price > book1.price) ? book : book1;
//    }
//
//    public static void main(String[] args) {
//        Book book = new Book("You", "are", 45, true, 5);
//        Book book1 = new Book();
//            //book
//        System.out.println("Title:"+ book.getTitle());
//        System.out.println("Author:"+ book.getAuthor());
//        System.out.println("Price: "+ book.getPrice());
//        book.info();
//        System.out.println("Bestseller? " + book.isBestseller());
//
//            //book1
//        System.out.println("Title:"+ book1.getTitle());
//        System.out.println("Author: "+ book1.getAuthor());
//        System.out.println("Price: "+ book1.getPrice());
//        book1.info();
//        System.out.println("Bestseller? " + book1.isBestseller());
//
//
//        Book expensive =  Book.compared(book, book1);
//        System.out.println("Expensive one: " + expensive.getPrice());
//
//        int[] ratings = {1, 2, 3, 4, 5};
//        String[] comments = {
//                "Very bad",
//                "Not good",
//                "Average",
//                "Good",
//                "Excellent"
//        };
//        for (int i = 0; i < ratings.length; i++) {
//            System.out.println("Rating: " + ratings[i] +
//                    " | Comment: " + comments[i]);
//        }
//
//    }
//}
