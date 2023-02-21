import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        ArrayList<Course> records = new ArrayList<Course>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. View student records");
            System.out.println("2. Add new student");
            System.out.println("3. Exit");
            
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                // Display all students in the records
                for (Course record : records) {
                    record.showDetails();
                    System.out.println();
                }

            } else if (choice == 2) {
                // Prompt the user for student details and add them to the records
                System.out.println("Enter student details:");
                System.out.print("Course Name: ");
                String courseName = input.nextLine();
                System.out.print("Student Name: ");
                String studentName = input.nextLine();
                System.out.print("Student ID: ");
                int studentId = input.nextInt();
                System.out.print("Student Age: ");
                int age = input.nextInt();
                records.add(new Student(courseName, studentName, studentId, age));
                System.out.println("Student added to the records.");

            } else if (choice == 3) {
                // Exit the program
                System.out.println("Exiting school system...");
                break;

            } else {
                // Invalid input
                System.out.println("Invalid input. Please try again.");
            }
      
        }
    }
}
