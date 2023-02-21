import java.util.ArrayList;
import java.util.Scanner;

abstract class Course {
    String courseName;
    
    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    public abstract void showDetails();
}

class Student extends Course {
    String studentName;
    int studentId;
    int age;
    
    public Student(String courseName, String studentName, int studentId, int age) {
        super(courseName);
        this.studentName = studentName;
        this.studentId = studentId;
        this.age = age;
    }
    
    public void showDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
    }
}