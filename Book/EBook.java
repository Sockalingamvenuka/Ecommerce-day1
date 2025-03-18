public class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, int publicationYear, double fileSize) {
        super(title, author, publicationYear); // Call to the base class constructor
        this.fileSize = fileSize;
    }

    // Getter and Setter methods for fileSize
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    // Overriding the displayInfo() method to add specific info for EBooks
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display common info
        System.out.println("File Size: " + fileSize + " MB"); // Additional info specific to EBooks
    }
}
