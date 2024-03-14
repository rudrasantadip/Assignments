import testpackage.Sample;

public class Question1
{
    public static void main(String[] args) {
        System.out.println("hello world");
        Sample sample = new Sample();
        System.out.println(sample.var2+"can only be accessed from outside");
    }
}