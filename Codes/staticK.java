class Student {
    int erp;
    static String clgName = "RISU";     // Static Variable - declared once, usable for all instance;

    static void print() {
        System.out.println(clgName);
    }
}

public class staticK {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.erp = 12;
        System.out.println(s1.clgName);  // Output: RISU

        Student s2 = new Student();
        System.out.println(s2.clgName);  // Output: RISU

        Student.print();           // Output: RISU
    }

    static {
        System.out.println("Static Block");         // Static black - it runs at the start even before main method;
    }
}