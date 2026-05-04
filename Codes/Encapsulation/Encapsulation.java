class Encap {
    private int age;

    void setAge(int age) {
        this.age = age;
    }

    void getAge() {
        System.out.println(age);
    }
}

public class Encapsulation {
    public static void main(String [] args) {
        Encap e1 = new Encap();
        e1.setAge(34);
        e1.getAge();
    }
}