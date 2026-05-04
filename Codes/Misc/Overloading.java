class ConstructorOverloading {
    ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(int a) {
        System.out.println("Parameterized Constructor");
    }
}

public class Overloading {
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
    }
}