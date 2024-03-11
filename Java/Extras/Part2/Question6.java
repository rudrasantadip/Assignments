/*
 * Java program to find the transpose of a 2d array
 */

public class Question6 {
    public static void main(String[] args) {
        int[][] array2D = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        
        int[][] transpose = transposeOf2DArray(array2D);
        
        System.out.println("Original 2D array:");
        print2DArray(array2D);
        
        System.out.println("Transpose of the 2D array:");
        print2DArray(transpose);
    }
    
    public static int[][] transposeOf2DArray(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        
        int[][] transpose = new int[columns][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        
        return transpose;
    }
    
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
