import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        System.out.println("Welcome to the Student Management System");
        while (true) {

            System.out.println("\n---MENU---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting Application...");
                break;
            }

            System.out.println("Option Selected: " + choice);
        }
        
        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Alice";
        student1.marks = 88;

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "Bob";
        student2.marks = 74;

        manager.addStudent(student1);
        manager.addStudent(student2);

        System.out.println("Students added successfully.");
        manager.displayAllStudents();
        
        Student found = manager.findStudentById(2);
        if (found !=null) {
            System.out.println("Found: " + found.name);
        } else {
            System.out.println("Student not found.");
        }

        manager.isPassed();
    }
}