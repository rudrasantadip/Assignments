/*
 * 
// please calculate the salary of the employee based on the condition if employees wage is >500 then 25000k else 20000k?
// For solving this create a Employee class add empName and empSal as private member .
// Now here add two method for taking the wage from user and then calculate the salary based on given wage in second method and display?
 * 
 */

 import java.util.Scanner;

 class Employee
 {
    private String empName;
    private Long empSalary;
    
    

    public String getEmpName() {
        return empName;
    }



    public void setEmpName(String empName) {
        this.empName = empName;
    }



    public Long getEmpSalary() {
        return empSalary;
    }



    public void setEmpSalary(Long empSalary) {
        this.empSalary = empSalary;
    }



    public void calcWage(Long wage)
    {
        if(wage>500)
        {
            this.empSalary=(long)25000;
        }
        else
        {
            this.empSalary=(long)20000;
        }
    }

    public void display()
    {
        System.out.println("Name: "+this.getEmpName());
        System.out.println("Salary: "+this.getEmpSalary());
    }
    
 }


 public class Question1
 {
    public static void main(String[] args) 
    {
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        e.setEmpName(sc.nextLine());

        System.out.print("Enter Wage For Employee " + e.getEmpName()+": ");
        e.calcWage(sc.nextLong());
        System.out.println();

        e.display();
    }
 }