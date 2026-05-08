class Parent {
    void show() {
        System.out.println("Parent class");
    }

    Parent(int x) {
        System.out.println("Parent constructor with x = " + x);
    }

    void print(int x){
        System.out.println("Value of x = " + x);
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class");
    }

    Child() {
        super();
        System.out.println("Child constructor");
    }

    void print(int x, int y){
        System.out.println("Value of double of x = " + 2 * x);
        System.out.println("Value of y = " + y);
    }
}

public class Override {
    public static void main(String[] args) {
        System.out.println("method overriding");

        Parent p = new Child();
        p.show();
        p.print(10);
    }
}