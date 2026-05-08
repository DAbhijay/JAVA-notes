class Person {
    private String name;
    private int age;

    void set(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void get() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person{
    int rollno;
    int marks;

    void setStudent(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    void display() {
        System.out.println("ERP: " + rollno);
        System.out.println("Marks: " + marks);
    }
}

public class Tutorial_Question_1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.set("Abhijay", 18);
        s1.setStudent(10435, 167);
        s1.get();
        s1.display();
    }
}