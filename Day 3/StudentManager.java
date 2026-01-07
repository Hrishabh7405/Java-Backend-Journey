import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student s : students) {
            System.out.println("ID: " + s.id + ", Name: " + s.name + ", Marks: " + s.marks);
        }
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }

    public void isPassed() {
        for (Student s : students) {
            if (s.marks >= 60) {
                System.out.println("PASSED -> " + s.name + "(" + s.marks + ")");
            }
        }
    }
}