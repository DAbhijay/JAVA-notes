import java.util.*;

abstract class Employee{
    String name;
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee{
    int salary;
    void calculateSalary(){
        System.out.println(name);
        System.out.println("Full Time Salary = " + salary);
    }
}

class PartTimeEmployee extends Employee{
    int salary;
    void calculateSalary(){
        System.out.println(name);
        System.out.println("Part Time Salary = " + salary);
    }
}

public class Abstraction2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FullTimeEmployee fte = new FullTimeEmployee();
        PartTimeEmployee pte = new PartTimeEmployee();
        int salary = sc.nextInt();

        fte.salary = salary;
        fte.name = "John";
        pte.name = "Mario";
        pte.salary = salary;
        fte.calculateSalary();
        pte.calculateSalary();
    }
}