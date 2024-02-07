// Write a program to implement a class coordinate with a method to display the values 
// of member variables. Use object reference variable. Compare two coordinates for 
// equality.

class Coordinate {
    private int x;
    private int y;

    // Constructor
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display values of member variables
    public void display() {
        System.out.println("Coordinate: (" + x + ", " + y + ")");
    }

    // Method to compare two coordinates for equality
    public boolean equals(Coordinate other) {
        return this.x == other.x && this.y == other.y;
    }

 
}


public class Question3
{
    public static void main(String[] args) {
        // Creating objects of Coordinate
        Coordinate coord1 = new Coordinate(3, 5);
        Coordinate coord2 = new Coordinate(3, 5);
        Coordinate coord3 = new Coordinate(7, 2);

        // Displaying coordinates
        System.out.println("Coordinate 1:");
        coord1.display();

        System.out.println("Coordinate 2:");
        coord2.display();

        System.out.println("Coordinate 3:");
        coord3.display();

        // Comparing coordinates for equality
        System.out.println("Is coordinate 1 equal to coordinate 2? " + coord1.equals(coord2));
        System.out.println("Is coordinate 1 equal to coordinate 3? " + coord1.equals(coord3));
    }    
}
