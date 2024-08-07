import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Index of the element to be removed
        int indexToRemove = 2; // Remove the element at index 2 (which is 3)

        // Create a new array with a size one less than the original array
        int[] newArray = new int[numbers.length - 1];

        // Copy the elements before the indexToRemove
        System.arraycopy(numbers, 0, newArray, 0, indexToRemove);

        // Copy the elements after the indexToRemove
        System.arraycopy(numbers, indexToRemove + 1, newArray, indexToRemove, numbers.length - indexToRemove - 1);

        // Print the new array
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}

