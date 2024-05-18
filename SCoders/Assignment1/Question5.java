/*
 * Please explain the merit of using the constructor function wih an exampe of class structure?
 * 
 * A constructor is used during object initialization
 * it is used to set the properties of an object during its creation
 * instead of initializing multiple properties seperately we can always
 * initialize them using the parameterized constructor
 */

class Person {
    // Instance variables
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }

    // Main method to test the Person class
   
}

public class Question5 {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person1 = new Person("Peter Parker", 30, "123 Main St");
        person1.displayInfo();

        // Creating another instance with different values
        Person person2 = new Person("Mary Jane", 25, "456 Elm St");
        person2.displayInfo();
    }
}
