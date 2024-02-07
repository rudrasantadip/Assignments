// Write a program to define a class student with name, roll, and marks as member 
// variables without any constructor with a method to display values of member 
// variables. Check the output of the program.
import java.util.Scanner;
class Student
{
    int roll;
    String name;
    float marks[]; 
}

public class Question2
{
    public static void printArray(float arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }

     
    public static void main(String[] args) 
    {

            Scanner sc = new Scanner(System.in);
            Student s = new Student();
            int n;

            //Inserting Data
            System.out.print("Enter Student name: ");
            s.name = sc.nextLine();

            System.out.print("Enter Roll number: ");
            s.roll=sc.nextInt();

            System.out.print("Number of subjects: ");
            n = sc.nextInt();

            s.marks = new float[n];
            System.out.println("Enter marks for "+n+" numbers: ");
            for(int i=0;i<n;i++)
            {
                s.marks[i]=sc.nextFloat();
            }
            sc.close();

            //Printing Data
            System.out.println("Student Name: "+s.name);
            System.out.println("Roll no: "+s.roll);

            System.out.println("Marks: ");
            printArray(s.marks);




    }
}
