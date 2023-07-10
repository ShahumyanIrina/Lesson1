public class Main {
    public static void main(String[] args) {
       
        Person author1 = new Person("Hermann Hesse");
        Person author2 = new Person("Robin Sharma");
        
      
        Book book1 = new Book("Book 1", author1);
        Book book2 = new Book("Book 2", author2);
        
      
        Librarian librarian = new Librarian("Poxos Poxosyan");
        
      
        Book[] books = { book1, book2 };
        Library library = new Library(books, librarian);

        System.out.println("Library information");
        library.displayBooks();

       

        for (Book book : books) {
            System.out.println(book.getTitle());
        }

        System.out.println("Author: Hermann Hesse, Book Title: Siddhartha");

        System.out.println("Author: Robin Sharma, Book Title: The Monk who sold his Ferrari");

        System.out.println("Library Librarian: " + library.getLibrarian().getName());
    }
}





 
      

      
       