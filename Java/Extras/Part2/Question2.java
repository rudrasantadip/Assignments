


public class Question2 
{
    public static int findDifference(int[] arr) {
        if (arr.length == 0) {

            return 0;
        }
        
   
        int smallest = arr[0];
        int largest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        int difference = largest - smallest;
        
        return difference;
    }
    public static void main(String[] args) {
        // Test the function
        int[] array = {1, 9, 3, 5, 7};
        System.out.println("Difference between largest and smallest values: " + findDifference(array));
    }
}
