public class AudioBook extends Book {
    private double duration;

    public AudioBook(String title, String author, int publicationYear, double duration) {
        super(title, author, publicationYear); // Call to the base class constructor
        this.duration = duration;
    }

    // Getter and Setter methods for duration
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    // Overriding the displayInfo() method to add specific info for AudioBooks
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display common info
        System.out.println("Duration: " + duration + " hours"); // Additional info specific to AudioBooks
    }
}
