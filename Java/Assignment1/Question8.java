import java.util.Arrays;

public class Question8
{
    public static void  printArray(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
      public static void main(String[] args) {
        // Create a sample string array
        String[] stringArray = {"Apple", "Orange", "Banana", "Grapes", "Kiwi"};

        // Display the unsorted array
        System.out.println("Unsorted String Array:");
        printArray(stringArray);

        // Sort the string array
        Arrays.sort(stringArray);

        // Display the sorted array
        System.out.println("\nSorted String Array:");
        printArray(stringArray);
    }    
}
