import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        int length = A.length() + B.length();
        int result = A.compareTo(B);
        
        System.out.println(length);

        if (result > 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    
        if (!A.isEmpty() && !B.isEmpty()) {
            A = A.substring(0, 1).toUpperCase() + A.substring(1);
            B=B.substring(0,1).toUpperCase()+B.substring(1);
        }
        
        System.out.print(A);
        System.out.print(" ");
        System.out.print(B);
        
        System.out.println(A+" "+B);
    }
}

