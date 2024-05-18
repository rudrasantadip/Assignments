/*
 * What is the importance of polymorphism with the help of inheritance explain ?
 * 
 * Polymorphirsm refers to the existence of the same data in different forms
 * Combining the concept of inheritance with polymorphism we can
 * child classes as instances of the parent class
 */

 class Animal
 {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
 }

 class Dog extends Animal {
    // Overriding method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Derived class
class Cat extends Animal {
    // Overriding method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}


public class Question6 
{
    public static void main(String[] args) {
        // Creating instances of derived classes
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Demonstrating polymorphism
        myDog.makeSound(); // Outputs: Dog barks
        myCat.makeSound(); // Outputs: Cat meows

        // Array of Animal type holding different objects
        Animal[] animals = {new Dog(), new Cat()};

        // Using polymorphism to call the appropriate method
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
