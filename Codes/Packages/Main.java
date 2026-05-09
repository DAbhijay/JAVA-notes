import pack1.Student1;
import pack2.Teacher;

public class Main{
    public static void main(String [] args) {
        Student1 s1 = new Student1();
        s1.setStudent("Abhijay", 10435, 167);
        s1.displayStudent();

        Teacher t1 = new Teacher("Shivansh Sir");
        t1.teach();
    }
}