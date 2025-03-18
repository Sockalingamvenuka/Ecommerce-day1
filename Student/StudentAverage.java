public class StudentAverage {
    public static void main(String[] args) {
        // Creating an array to store student objects
        Student[] students = {
            new Student("Venu", 85),
            new Student("Banu", 78),
            new Student("Chanu", 92),
            new Student("Dilux", 74),
            new Student("Lano", 88)
        };

        // Calculate average marks
        int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.marks;
        }

        double averageMarks = (double) totalMarks / students.length;

        // Print the result
        System.out.println("Average Marks: " + averageMarks);
    }
}
//Average Marks: 83.4