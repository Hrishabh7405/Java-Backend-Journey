public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Student Record Manager started");

    Student student1 = new Student();
    student1.id = 1;
    student1.name = "Alice";
    student1.marks = 88;

    Student student2 = new Student();
    student2.id = 2;
    student2.name = "Bob";
    student2.marks = 74;

    System.out.println(student1.name + " scored " + student1.marks);
    System.out.println(student2.name + " scored " + student2.marks);
    }
}