import java.util.Scanner;
// Write  a  program  to  implement  2  D  integer  array  with  different  number  of columns in different rows
public class Question5
{

    public static void printarray(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;i++)
            {
                System.out.print(arr[i][j]+" , ");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        int cols;
        int arr[][] = new int[rows][];

        for(int i=0;i<rows;i++)
        {
            System.out.print("no of columns for row "+(i+1)+": ");
            cols=sc.nextInt();
            arr[i]=new int[cols];
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Dynamic Columns 2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();


        

    }
}
