/*
 *Write  a  program  to  call  the  base  class  constructor  from  the  derived  class 
constructor using super keyword
 */

 class Base
 {
    Base()
    {
        System.out.println("Base class is called");
    }
 }

 class Derived extends Base
 {
    Derived()
    {
        System.out.println("Derived class is called");
    }
 }


public class Question2 
{
    public static void main(String[] args) {
        new Derived();
    }
}
