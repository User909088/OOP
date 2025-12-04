package Nested_class.inner_class_accessing_outer_class_members;

public class Library {
    private String library_name;

    public Library(String library_name){
        this.library_name = library_name;
    }

   public class Book {
       public String getLibraryName(){
           return library_name;
       }
    }

    public static void main(String[] args) {
        Library lib = new Library("Books");
        Library.Book  book = lib.new Book();
        System.out.println(book.getLibraryName());
    }
}
