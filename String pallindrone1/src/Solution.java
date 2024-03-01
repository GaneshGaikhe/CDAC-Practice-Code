import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        //char [] arr=A.toCharArray();
        
        
        int left=0;
        int right=A.length()-1;
        
        while(left<right)
        {
            if(A.charAt(left)!=A.charAt(right))
            {
                System.out.println("No");
                return;
            }
            left++;
            right--;   
        }
            System.out.println("Yes");
        
        
        
    }
}





//
//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//        
//        char [] arr=A.toCharArray();
//        
//        
//        int left=0;
//        int right=arr.length-1;
//        
//        while(left<right)
//        {
//            if(arr[left]!=arr[right])
//            {
//                System.out.println("No");
//                return;
//            }
//            left++;
//            right--;   
//        }
//            System.out.println("Yes");
//        
//        
//        
//    }
//}
//
//
