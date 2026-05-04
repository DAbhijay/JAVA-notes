import java.util.*;

public class String1 {
    public static void main(String[] args) {

        // 1. CREATION
        String s1 = "Hello";
        String s2 = new String("World");

        // 2. METHODS
        System.out.println(s1.length());         // length
        System.out.println(s1.toUpperCase());    // toUpperCase
        System.out.println(s1.toLowerCase());    // toLowerCase
        System.out.println(s1.charAt(2));        // charAt
        System.out.println(s1 + s2);             // concat with +
        System.out.println(s1.concat(s2));       // concat method

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

        // Mutable Strings
        StringBuilder strd = new StringBuilder("Hello ji");
        StringBuffer strf = new StringBuffer("hello");

        strd.append("java");          // append
        System.out.println(strd);

        strd.insert(2, "Abhijay");    // insert
        System.out.println(strd);

        strd.delete(2, 4);            // delete
        System.out.println(strd);

        strd.replace(2, 5, "Hello World!");  // replace
        System.out.println(strd);

        String inp = "world";               // reverse
        StringBuilder sb1 = new StringBuilder(inp);
        sb1.reverse();
        String ans = sb1.toString();
        System.out.println(ans);
    }
}