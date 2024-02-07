 class Factorial {
    

    // Method to calculate factorial using recursion
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 and 1 is 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive call to calculate factorial
        }
    }
}

public class Question5
{
    public static void main(String[] args) {
        int number = 5; // Example number for which factorial is calculated
        long factorial = Factorial.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}