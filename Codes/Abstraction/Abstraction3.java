import java.util.*;

abstract class FoodItem{
    abstract void prepare();
    abstract void serve();
}

class Pizza extends FoodItem{
    void prepare(){
        System.out.println("Preparing Pizza...");
    }
    void serve(){
        System.out.println("Serving Pizza...");
    }
}

class Burger extends FoodItem{
    void prepare(){
        System.out.println("Preparing Burger...");
    }
    void serve(){
        System.out.println("Serving Burger...");
    }
}

public class Abstraction3{
    public static void main(String[] args) {
        Pizza p = new Pizza();
        p.prepare();
        p.serve();

        System.out.println();

        Burger b = new Burger();
        b.prepare();
        b.serve();
    }
}