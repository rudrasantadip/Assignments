/*
 * Write  a  program  to check visibility  of private variables in case of 
inherited classes. 
 */

import java.lang.reflect.Field;

class Sample
{
    private int sampleVar1;
    public int sampleVar2;    
}

public class Question2 extends Sample
{
    public static void displayVarAccess(Field[] fields)
    {
        for (Field field : fields) {
            if ((field.getModifiers() & java.lang.reflect.Modifier.PRIVATE) != 0) {
                System.out.println("Field " + field.getName() + " is private");
            } 
            else if((field.getModifiers() & java.lang.reflect.Modifier.PUBLIC)!=0)
            {
                System.out.println("Field " + field.getName() + " is not private");
            }
        }
    }
    public static void main(String[] args)
    {
        Sample sample = new Sample();
        Question2 obj = new Question2();


        Field[] fieldsofSample = sample.getClass().getFields();
        Field[] fieldsofQuestion2 = obj.getClass().getFields();

        displayVarAccess(fieldsofSample);

        displayVarAccess(fieldsofQuestion2);

    

    }    
}
