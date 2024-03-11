import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 
{
    public static int vowelCount(String sentence)
    {
        int count=0;
        String temp = sentence.toLowerCase();
        for(int i=0;i<temp.length();i++)
        {
            char key = temp.charAt(i);
            if(key=='a' || key=='e' || key == 'i' || key=='o' || key=='u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a sentence: ");
        try 
        {
            String sentence = bf.readLine();
            System.out.println("No of vowels: "+vowelCount(sentence));
            System.out.println("Vowels are repeated");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }    
}
