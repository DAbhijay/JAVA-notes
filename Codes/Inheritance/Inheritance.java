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

class Cat extends Pet {
    void meow() {
        System.out.println("Meowing...");
    }
}

class Car {
    String name;
    int price;
    int speed;
}

class Kia extends Car {
    void type() {
        System.out.println("Manual Driving");
    }
}

class Tesla extends Car {
    void type() {
        System.out.println("Auto Driving");
    }
}

public class Inheritance {
    public static void main(String [] args){
        Dog d = new Dog();
        Cat c = new Cat();
        Tesla t = new Tesla();
        Kia k = new Kia();
        
        d.name = "Jerry";
        d.age = 9;
        d.bark();
        d.eat();

        c.name = "Tom";
        c.age = 7;
        c.meow();
        c.eat();

        k.name = "Kia Seltos";
        k.price = 6000000;
        k.speed = 180;
        k.type();

        t.name = "Tesla Model 3";
        t.price = 6000000;
        t.speed = 180;
        t.type();
    }
}


