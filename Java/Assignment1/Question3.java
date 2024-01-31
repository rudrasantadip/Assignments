import java.util.Scanner;
public class Question3 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Get user input as an integer
            System.out.print("Enter a number (negative to exit): ");
            int number = scanner.nextInt();

            // Check if the number is negative
            if (number < 0) {
                System.out.println("Exiting the loop. Goodbye!");
                break;  // Exit the loop if the number is negative
            } else {
                System.out.println("You entered: " + number);
            }
        } while (true);
        scanner.close();
    }   
}

