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

            if (choice ==1) {
                System.out.print("Enter Student ID: ");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Student Marks: ");
                int marks = scanner.nextInt();

                Student student = new Student();
                student.id = id;
                student.name = name;
                student.marks = marks;
                
                manager.addStudent(student);
                System.out.println("Student added successfully.");
            } else if (choice == 2){
                manager.displayAllStudents();
            } else if (choice == 3) {
                System.out.println("Exiting Application...");
                break;
            } else {
                System.out.println("Invalid option. Select a valid option.");
            }
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