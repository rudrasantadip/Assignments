// Work with default and public member variables of a class. Set values and display values 
// from main().

public class Question7 
{
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass obj = new MyClass(10, 20);

        // Displaying values
        System.out.println("Default Variable: " + obj.defaultVar);
        System.out.println("Public Variable: " + obj.publicVar);

        // Modifying values
        obj.defaultVar = 30;
        obj.publicVar = 40;

        // Displaying modified values
        System.out.println("Modified Default Variable: " + obj.defaultVar);
        System.out.println("Modified Public Variable: " + obj.publicVar);
    } 
}

class MyClass {
    int defaultVar; // Default access modifier
    public int publicVar; // Public access modifier

    // Constructor
    public MyClass(int defaultVar, int publicVar) {
        this.defaultVar = defaultVar;
        this.publicVar = publicVar;
    }
}


