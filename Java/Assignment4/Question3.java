class Student
{
    private String name;
    private int rollNo;
    private static final String COLLEGE_NAME="University of Engineering & Management";

    Student(String name, int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public static String getCollegeName() {
        return COLLEGE_NAME;
    }

}

public class Question3 
{
    public static void main(String[] args)
    {
        Student s = new Student("Santadip Rudra", 47);
        
        System.out.println("Name: "+s.getName());
        System.out.println("Roll no: "+s.getRollNo());
        System.out.println("College Name "+Student.getCollegeName());
    }
}
