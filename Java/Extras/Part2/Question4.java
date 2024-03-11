//Sort an array in decending order

import java.util.Arrays;
import java.util.Collections;

public class Question4 
{
    public static void main(String[] args) {
        // Create an array of integers
        Integer[] array = {5, 3, 9, 1, 7};
        
        // Sort the array in descending order
        Arrays.sort(array, Collections.reverseOrder());
        
        // Print the sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
