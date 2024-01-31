// Write a program to work with float input (predefined).
// Program to calculate average marks


public class Question1
{
    public static void main(String[] args)
    {
        int i;
        float sum=0.0f;
        float marks [] = {32.03f,69.81f,54.56f};
        
            for(i=0;i<marks.length;i++)
            {
                sum+=marks[i];
            }

            System.out.format("The average marks is: %.2f",sum/marks.length);
         


    }
}