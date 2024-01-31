// Write a program to work with for loop (Printing a triangle of numbers).
import java.util.Scanner;
public class Question4 
{
    public static void main(String[] args)
    {

        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
}
