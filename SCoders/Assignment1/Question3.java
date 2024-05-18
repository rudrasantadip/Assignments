/*
 * Please explain the usage with example the use of this ,
 * super ,final , finally, private ,public and protected ?
 * 
 * 1. super
The super keyword in Java is used to refer to the immediate parent class object. 
It is used to access methods and variables from the parent class.

2. final
The final keyword is used to declare constants,
 prevent method overriding, and prevent inheritance.

 3. finally
The finally block is used to execute important code such as closing a resource, 
regardless of whether an exception occurs or not.

. private
The private keyword is an access modifier used for attributes, methods, and constructors, 
making them accessible only within the declared class.

5. public
The public keyword is an access modifier used for classes, attributes, methods, 
and constructors, making them accessible from any other class.

6) protected
The protected keyword is an access modifier used for attributes, methods, and constructors,
 making them accessible within the same package and subclasses.

 */

class Life
{
    protected Integer lifeSpan;
    public String genus;
    public String species;
}

class Primate extends Life
{
    protected Integer tailLength;
    protected Integer thumbLength;

    public void makeSound()
    {
        System.out.println("KIKIIIIII");
    }

}

class Fish extends Life
{
    public String bodyStructure;
    protected String finType;
    public final boolean eyelash = false;
}


class Human extends Primate
{
    private Integer brainWeight;

    public Integer getBrain()
    {
        return this.brainWeight;
    }

    public void setBrain(Integer brainWeight)
    {
        this.brainWeight=brainWeight;
    }


    public void makeSound()
    {
        super.makeSound();
    }
}

class Shark extends Fish
{

}

public class Question3 
{
    public static void main(String[] args) {
        Human human = new Human();

        human.lifeSpan=60;
        human.genus="Homo Sapiens";
        human.species="Sapiens";
        human.tailLength=0;
        human.thumbLength=1;
        human.setBrain(1500);
        System.out.println(human.getBrain());
        human.makeSound();


        Shark s = new Shark();
        s.bodyStructure="Cartilage";
        System.out.println(s.getClass().getName());

    }
}
