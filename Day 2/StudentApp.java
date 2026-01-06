import java.util.ArrayList;
public class StudentApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        
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
    }
}