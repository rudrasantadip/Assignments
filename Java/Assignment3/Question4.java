/*
 * Write a program to check how the constructor of the base class is called.
 */

 class Base {
    Base() {
        System.out.println("Constructor of Base class called.");
    }
}

class Derived extends Base {
    Derived() {
        super(); // This line implicitly calls the constructor of the Base class
        System.out.println("Constructor of Derived class called.");
    }
}



public class Question4 
{
    public static void main(String[] args) 
    {
    new Derived();
    }
}
