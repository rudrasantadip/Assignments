package testpackage;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Sample {
    String var1 = "default variable";
    public String var2 = "public variable";
    private String var3 = "private variable";

    public Sample()
    {
        System.out.println("Sample object created\n Available fields: ");
        Field [] fields =   this.getClass().getDeclaredFields();
        for(Field f : fields)
        {
         System.out.println(f.getName()+" : "+Modifier.toString(f.getModifiers()));
        }
    }
}
