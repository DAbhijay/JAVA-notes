import java.util.*;

abstract class Payment{
    abstract void pay(double amount);
}

class CreditCard extends Payment{
    void pay(double amount){
        System.out.println("Paying " + amount + " using Credit Card");
    }
}

class UPI extends Payment{
    void pay(double amount){
        System.out.println("Paying " + amount + " using UPI");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CreditCard cc = new CreditCard();
        UPI upi = new UPI();

        int amount = sc.nextInt();
        cc.pay(amount);
        upi.pay(amount);
    }
}