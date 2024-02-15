/*
 * Write a program to print all the armstrong numbers between 200 to 400.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class ArmStrong
 {

    //Method to extract the digits of a number and cube them and add
    private int sigmaCube(int n)
    {
        int temp= n,sum=0;
        while (temp!=0)
        {
            sum+=Math.pow(temp%10, 3);
            temp=temp/10;    
        }
        return sum;
    }


    //Method to check if a given number is armstrong
    public boolean isArmStrong(int n)
    {
            int cubeSum = sigmaCube(n);
            if(cubeSum==n) 
            {
                return true;
            }        
            return false;
    }
    

    //Method to get a list of arm strong numbers within a given range
    public List<Integer> getArms(int start, int end)
    {
        List<Integer> armstrongs = new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            if(isArmStrong(i))
            {
                armstrongs.add(i);
            }
        }

        return armstrongs;
    }
 }

 public class Question1 {
    public static void main(String[] args)
    {
        ArmStrong armStrong = new ArmStrong();
        Scanner sc = new Scanner(System.in);
        int s,e;
        System.out.print("Start: ");
        s=sc.nextInt();
        System.out.print("End: ");
        e=sc.nextInt();

        List<Integer> response = armStrong.getArms(s, e);
        System.out.println(response);
        sc.close();
       
    }
 }