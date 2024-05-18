/*
 * Please explain the usage of condition and loop statement
 *  with an example in core java program using some class structure?
 */

import java.util.Scanner;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}


public class Question4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            int marks;
            while (true) {
                System.out.print("Enter the marks of " + name + ": ");
                marks = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Please enter valid marks between 0 and 100.");
                }
            }

            students[i] = new Student(name, marks);
        }

        System.out.println("\nStudent Grades:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGrade());
        }

        scanner.close();
    }
}
