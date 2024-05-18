/*
 * Give an example of Exception handling for better code performance and also create customized Exception class
 * and show in the example?
##note for all the above questions please use class base coding structure in answers as possible to explain.
 */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120");
        }
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class Question7
{
    public static void main(String[] args) {
        try {
            // Creating a valid person instance
            Person person1 = new Person("John Doe", 30);
            person1.displayInfo();
            
            // Attempting to create an invalid person instance
            Person person2 = new Person("Jane Smith", -5);
            person2.displayInfo();
        } catch (InvalidAgeException e) {
            // Handling the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }

        System.out.println("Program continues...");
    }
}
