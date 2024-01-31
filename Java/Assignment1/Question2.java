// Write a program to work with while loop. 
// Program to reverse a number
import java.util.Scanner;

public class Question2 
{
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int temp=n,rev=0;
        while (temp!=0)
        {
            rev = rev*10+(temp%10);
            temp=temp/10;
        }
        System.out.println("Reversed Number: "+rev);
        sc.close();
    }  
}
