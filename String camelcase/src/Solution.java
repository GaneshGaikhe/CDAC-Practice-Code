import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static void main(String[] args) {
    	 String ss="my name is ganesh";
 	    int index=0;
 	    int count=1;
 	    
 	    for(int i=0;i<ss.length();i++)
 	    {
 	        char ch=ss.charAt(i);
 	        if(Character.isLowerCase(ch))
 	        {
 	            index++;
 	        }
 	        else
 	        { count++;}
 	        
    	
    }
    
 	    System.out.println(count);
	}

}


