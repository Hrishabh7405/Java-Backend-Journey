import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        System.out.println("Welcome to the Student Management System");
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();
        System.out.println("Hello, " + input);
        
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