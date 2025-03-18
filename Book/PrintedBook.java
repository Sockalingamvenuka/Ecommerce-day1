public class PrintedBook extends Book {
    private int pages;

    public PrintedBook(String title, String author, int publicationYear, int pages) {
        super(title, author, publicationYear); // Call to the base class constructor
        this.pages = pages;
    }

    // Getter and Setter methods for pages
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Overriding the displayInfo() method to add specific info for PrintedBooks
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display common info
        System.out.println("Pages: " + pages); // Additional info specific to PrintedBooks
    }
}
