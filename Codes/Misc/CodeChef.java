class Students {
    void study() {
        System.out.println("studying");
    }

    void print() {
        System.out.println(erp);
        System.out.println(name);
    }

    void set (String name, int erp) {
        this.name = name;
        this.erp = erp;
    }

    public class CodeChef {
        public static void main(String [] args) {
            Students s1 = new Students();
            s1.set("xyz", 456);
            s1.study();
            s1.print();

            Students s2 = new Students();
            s2.set("abc", 123);
            s2.study();
            s2.print();
        }
    }
}