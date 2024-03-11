// Sort an array in acending order...

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        // Create an array of integers
        int[] array = {5, 3, 9, 1, 7};
        
        // Sort the array in ascending order
        Arrays.sort(array);
        
        // Print the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

