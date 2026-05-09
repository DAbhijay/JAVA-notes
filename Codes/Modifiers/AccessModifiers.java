class Parent{
    private int a = 10;
    public int b = 15;
    protected int c = 20;
    int d = 30; //default modifier
}

class Child extends Parent{
    public void show(){
        // System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class AccessModifiers{
    public static void main(String[] args) {
        System.out.println("Access Modifiers in Java: ");
        Child c1 = new Child();
        c1.show();
    }
}