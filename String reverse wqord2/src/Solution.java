import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    String ipp="Hello World";
   System.out.println(reversedword(ipp));
    
    
    
    }
    
    public static String reversedword(String s)
    {
        String input=s;
        String [] arr=s.split("\\s+");
        
        String [] ch=new String[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            ch[j]=arr[i];
            j++;
        }
        
        String op=String.join(" ",ch);
        op=op.trim();
        System.out.println(op);
        char [] jj=op.toCharArray();
        
       // char a=op.charAt(0).toUpperCase();
        
        jj[0]=Character.toUpperCase(jj[0]);
        
        
        for(int i=0;i<jj.length;i++)
        {
            if(jj[i]==' ')
            {
                jj[i+1]=Character.toUpperCase(jj[i+1]);
            }
        }
        
        return new String (jj);
        
    }
}