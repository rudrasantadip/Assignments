/**
 * Write a java program to add all elements
 * of a two d array...
 */

public class Question5 
{
    public static void main(String[] args) {
        int[][] array2D = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        
        int sum = sumOf2DArray(array2D);
        
        System.out.println("Sum of all elements in the 2D array: " + sum);
    }
    
    public static int sumOf2DArray(int[][] arr) {
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        
        return sum;
    }    
}
