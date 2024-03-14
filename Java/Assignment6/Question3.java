/**
 * Write a program that extends interface
 */


//Write the code from car.java before writing this class

public class Question3 implements Car
{

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    public static void main(String[] args) {
        new Question3().run();
    }
    
}
