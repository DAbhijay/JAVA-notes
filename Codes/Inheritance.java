class Pet {
    String name;
    int age;

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Pet {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Inheritance {
    public static void main(String [] args){
        Dog d = new Dog();
        d.name = "Jerry";
        d.age = 9;
        d.bark();
        d.eat();
    }
}
