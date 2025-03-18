public class ReverseLeftRight {
    public static void main(String[] args) {
        int num = 9; // Change this value for different inputs

        int mid = num / 2;

        // Print the left half in reverse order
        for (int i = mid; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // Print the right half in reverse order
        for (int i = num; i > mid; i--) {
            System.out.print(i + " ");
        }
    }
}
//4 3 2 1 9 8 7 6 5 