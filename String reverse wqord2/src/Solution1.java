import java.io.*;
import java.util.*;

public class Solution1{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "He is a very very good boy, isn't he?";
        resd(s);
    }
    
    
    static void resd(String s)
    {
       // String [] arr=a.split("\\s+");
               // String [] arr=s.split("\\s+");
    	
     //   String[] arr = s.split("\\W+");
        String[] arr = s.split("[^A-Za-z]+");

                String op=String.join(" ", arr);
                op=op.trim();
                int count=arr.length;

        System.out.println(count);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        
    }
    
}

