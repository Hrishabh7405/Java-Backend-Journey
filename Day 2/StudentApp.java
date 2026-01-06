import java.util.ArrayList;
public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Student Record Manager started");

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Alice";
        student1.marks = 88;

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "Bob";
        student2.marks = 74;

        students.add(student1);
        students.add(student2);

        for (Student s : students) {
            System.out.println(s.name + " scored " + s.marks);
        }
    }
}