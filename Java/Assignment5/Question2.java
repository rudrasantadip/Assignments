/*
 * Write a programt to work with different builtin exceptions
 */

import java.util.Scanner;
public class Question2 
{
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers to divide:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = divide(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
