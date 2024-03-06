/*
 * Write a program to work with multiple catch block. 
 */

 import java.util.InputMismatchException;
import java.util.Scanner;
 public class Question1
 {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n1,n2;

        try
        {
            System.out.println("Enter 1st number: ");
            n1=sc.nextInt();
            System.out.println("Enter 2nd number: ");
            n2=sc.nextInt();
            System.out.println("The division is "+ n1/n2);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by zero is not possible");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter numbers only");
        }
        sc.close();
      
    }
 }