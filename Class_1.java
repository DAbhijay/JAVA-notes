import java.util.Scanner;

class Mobile {
    String brand;
    double price;
    int battery;
}

public class Class_1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile mob = new Mobile();
        System.out.print("Enter brand: ");
        mob.brand = sc.nextLine();
        System.out.print("Enter price: ");
        mob.price = sc.nextDouble();
        System.out.print("Enter battery: ");
        mob.battery = sc.nextInt();
        System.out.println();
        System.out.println("Data Entered => ");
        System.out.println("brand: " + mob.brand);
        System.out.println("price: " + mob.price);
        System.out.println("battery: " + mob.battery);
    }
}