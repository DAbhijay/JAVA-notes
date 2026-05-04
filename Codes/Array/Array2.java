import java.util.*;

public class Array2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int jagArr[][] = {
            {10 ,20 ,30},
            {40, 50},
            {60, 70, 80, 90}
        };
        int sum = 0;
        int max = jagArr[0][0];

        for (int i = 0; i <jagArr.length; i++){
            for (int j = 0; j < jagArr[i].length; j++){
                sum += jagArr[i][j];
                if (jagArr[i][j] > max){
                    max = jagArr[i][j];
                }
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
    }
}