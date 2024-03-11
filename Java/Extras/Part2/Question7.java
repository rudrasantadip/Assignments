public class Question7
{
public static void main(String[] args) {
    int[][] squareArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    
    System.out.println("Original Array:");
    print2DArray(squareArray);
    
    swapDiagonalElements(squareArray);
    
    System.out.println("Array after swapping diagonal elements:");
    print2DArray(squareArray);
}

public static void swapDiagonalElements(int[][] arr) {
    int n = arr.length;
    
    for (int i = 0; i < n; i++) {
        int temp = arr[i][i];
        arr[i][i] = arr[i][n - 1 - i];
        arr[i][n - 1 - i] = temp;
    }
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

