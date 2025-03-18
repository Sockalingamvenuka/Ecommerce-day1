import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books; // ArrayList to store different types of books

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        for (Book book : books) {
            book.displayInfo(); // Polymorphic call to display book info
            System.out.println("---------------");
        }
    }
}
