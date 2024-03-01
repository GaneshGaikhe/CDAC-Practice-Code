import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter string");
        String S = in.next();
        System.out.println("enter start index");
        int start = in.nextInt();
        System.out.println("enter end index");
        int end = in.nextInt();
        
        String result=S.substring(start,end);
        System.out.println(result); 
        
    }
    
    
}