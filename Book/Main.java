public class Main {
    public static void main(String[] args) {
        // Creating library object
        Library library = new Library();

        // Creating different types of books
        PrintedBook printedBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180);
        EBook eBook = new EBook("1984", "George Orwell", 1949, 1.2);
        AudioBook audioBook = new AudioBook("To Kill a Mockingbird", "Harper Lee", 1960, 12.5);

        // Adding books to library
        library.addBook(printedBook);
        library.addBook(eBook);
        library.addBook(audioBook);

        // Displaying all books in the library
        library.displayBooks();
    }
}

/*
Title: The Great Gatsby
Author: F. Scott Fitzgerald
Published Year: 1925
Pages: 180
---------------
Title: 1984
Author: George Orwell
Published Year: 1949
File Size: 1.2 MB
---------------
Title: To Kill a Mockingbird
Author: Harper Lee
Published Year: 1960
Duration: 12.5 hours
---------------*/