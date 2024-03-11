import java.util.Arrays;
import java.util.Scanner;

public class Question10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int[] firstHalf = Arrays.copyOfRange(array, 0, size / 2);
        int[] secondHalf = Arrays.copyOfRange(array, size / 2, size);
        
        System.out.println("First half of the array: " + Arrays.toString(firstHalf));
        System.out.println("Second half of the array: " + Arrays.toString(secondHalf));
    }
}
