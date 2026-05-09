package pack1;

public class Student1{
   String name;
    int erp;
    double marks;

    public void setStudent(String name, int erp, double marks) {
        this.name = name;
        this.erp = erp;
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("Name = " + name);
        System.out.println("Erp = " + erp);
        System.out.println("Marks = " + marks);
    }
}