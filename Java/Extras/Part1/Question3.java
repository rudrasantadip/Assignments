

public class Question3
{
    public static void main(String[] args) {
        int a,b;
        try
        {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);

            System.out.println("The sum is: "+a+b);
        }
        catch(Exception e)
        {
            System.out.println("Some error occured");
        }
    }    
}
