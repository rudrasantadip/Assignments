/*
 * 1) Write a program to find the sum of even numbers in an  integer array 
 */

class Sum {
    public static int sumOfEvenNumbers(int[] arr) {
        // Initialize sum
        int sumEven = 0;
        
        // Iterate through the array
        for (int num : arr) {
            // Check if the number is even
            if (num % 2 == 0) {
                sumEven += num;
            }
        }
        
        return sumEven;
    }
    
    
}


public class Question1
{
    public static void main(String[] args) {
        // Test the function
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Sum of even numbers in the array: " + Sum.sumOfEvenNumbers(array));
    }
}