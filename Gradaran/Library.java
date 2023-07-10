public class Library {
    private Book[] books;
    private Librarian librarian;

    public Library(Book[] books, Librarian librarian) {
        this.books = books;
        this.librarian = librarian;
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor().getName());
        }
    }

    public Librarian getLibrarian() {
        return librarian;
    }
}