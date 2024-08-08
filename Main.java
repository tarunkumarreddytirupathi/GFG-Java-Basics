public class Main {

    // Method to check if three integers are equal
    public static boolean areAllEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public static void main(String[] args) {
        // Calling the method with three integers
        boolean result = areAllEqual(10, 10, 10);

        // Print the result
        System.out.println("Are all three numbers equal? " + result);
    }
}
