// Write a program to show call by reference using member variables of an object
class SampleClass {
    int value;

    SampleClass(int value) {
        this.value = value;
    }
}


public class Question6
{
    public static void main(String[] args) {
        SampleClass obj = new SampleClass(10);
        System.out.println("Before: " + obj.value);

        modifyObject(obj);

        System.out.println("After: " + obj.value);
    }

    // Method to modify the member variable of the object
    public static void modifyObject(SampleClass obj) {
        obj.value = 20;
    }
}
