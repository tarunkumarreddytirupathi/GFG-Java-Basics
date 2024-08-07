import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Index of the element to be removed
        int indexToRemove = 2; // Remove the element at index 2 (which is 3)

        // Create a new array with a size one less than the original array
        int[] newArray = new int[numbers.length - 1];

        // Copy elements to the new array, excluding the element to remove
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = numbers[i];
            }
        }

        // Print the new array
        System.out.println(newArray[0]);
    }
}
