import java.util.*;


public class Array {
    public static void main(String [] args) {
        int fixed[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        //  Input in 2d Array
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < fixed.length; i++) {
            for (int j = 0; j < fixed[i].length; j++) {
                fixed[i][j] = sc.nextInt();
                System.out.println(fixed[i][j]);
            }
            System.out.println(" ");
        }
    }
}