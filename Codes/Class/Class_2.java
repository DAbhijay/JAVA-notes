import java.util.Scanner;

class Student {
    String name;
    int ERP;
    int Age;

    void setProperties(String n, int r, int a) {
        name = n,
        erp = r,
        age = a
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}

public class Class_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.print("Enter Name: ");
        s1.name = sc.nextLine();
        
        System.out.print("Enter ERP: ");
        s1.ERP = sc.nextInt();
        
        System.out.print("Enter Age: ");
        s1.Age = sc.nextInt();
        
        System.out.println();
        System.out.println("Data Entered => ");
        
        System.out.println("Name: " + s1.name);
        System.out.println("ERP: " + s1.ERP);
        System.out.println("Age: " + s1.Age);

        s1.study(); 
    }
}