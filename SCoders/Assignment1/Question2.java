/*
 * create a template /class structure to store data for student where you shulde have two classes 
 * one for student which will have name,class and college name
 *  as data member and appropriate methods for taking the data and displaying them with 
 * there address fields namely state ,
 * city but remember address should be in another class and you inherited them?
##note object will be of Student class.
 */

class Address
{
    private String state;
    private String city;


   public Address(String state, String city)
   {
    this.state=state;
    this.city=city;
   }


public String getState() {
    return state;
}


public String getCity() {
    return city;
}

   

    
} 

class Student extends Address
{
    private String name;
    private String studentClass;
    private String collegeName;

    public Student(String name,String studentClass,String collegeName, String state, String city )
    {
        super(state, collegeName);
        this.name=name;
        this.studentClass=studentClass;
        this.collegeName=collegeName;
    }

    public String getName() {
        return name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Class: "+studentClass);
        System.out.println("College Name: "+collegeName);
        System.out.println("City: "+this.getCity());
        System.out.println("State: "+this.getState());
    }
    
    

    
}


public class Question2 {
 public static void main(String[] args) {
        Student s = 
        new 
        Student("Santadip Rudra",
        "XI",
        "UEM",
        "WEST BENGAL",
        "KOLKATA");

        s.display();

    
 }   
}
