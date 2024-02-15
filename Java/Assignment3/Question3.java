/*
 * Write a program to implement multilevel inheritance
 * 
 * ____________
 * |base class|
 *    |  
 *    | 
 * __________________
 * |Intermediary class|
 *    |  
 *    |
 * ______________
 * |Derived class|
 *      
 *      
 * 
 *   
 */     


 class Base
 {
   protected String base="I am a string of the base class";
 }

 class Intermediate extends Base
 {
    String intermediate = "I am a string of the intermediate class";
 }

 class Derived extends Intermediate
 {
    String derived = "I am a string of the derived class";

    public static void printBase()
    {
        Derived obj = new Derived();
        System.out.println(obj.base);
    }
 }



public class Question3 
{
    public static void main(String[] args) {
        Derived.printBase();
    }
}
