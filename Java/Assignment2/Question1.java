// Write a program to implement a class coordinate with a method to display the values 
// of member variables. Assign the values of the member variable inside the main method. 
// Use new this time.
import java.util.Scanner;
class Coordinate
{
    float x_coordinate;
    float y_coordinate;
}


public class Question1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Coordinate cor = new Coordinate();

        System.out.print("Enter X Coordinate: ");
        cor.x_coordinate=(sc.nextFloat());
        System.out.print("Set y coordinate: ");
        cor.y_coordinate=(sc.nextFloat());

        System.out.println();
        System.out.println("X Coornidate: "+cor.x_coordinate+"\nY Coordinate: "+cor.y_coordinate);
        sc.close();
    }
}