/*
 * Write a program to prompt an user their name and age
 * and print the year in which the user was born
 */

import java.time.LocalDateTime;
import java.util.Scanner;

class User
 {
    String name;
    int age;

    User ()
    {

    }
   
 }

 public class Question1 {
 
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            User u = new User();
            
            System.out.print("Enter name: ");
            u.name=sc.nextLine();

            System.out.print("Enter age: ");
            u.age=sc.nextInt();
            
            int year =  LocalDateTime.now().minusYears(u.age).getYear();
            System.out.println(year);
    }
 }