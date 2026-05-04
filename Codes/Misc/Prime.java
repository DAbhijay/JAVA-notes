/*************  ✨ Windsurf Command ⭐  *************/
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++){
            int pwd1 = sc.nextInt();
            int pwd2 = sc.nextInt();
            if (isPrime(pwd1) && isPrime(pwd2)){
                System.out.println("Vault Opened");
            } else {
                System.out.println("Alarms Triggered");
            }
        }
        sc.close();
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
/*******  9889f452-72c5-4adc-92c7-392be52cad9e  *******/
