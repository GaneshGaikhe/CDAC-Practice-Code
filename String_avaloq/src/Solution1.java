// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution1 {

    public static void main(String[] args)
    {   int []A ={3, 8, 9, 7, 6};
    	  int  K = 3;
        int [] answer=solution1(A,K);
        System.out.println();
    }
    public static int[] solution1(int[] A, int K) {
        // Implement your solution here
    	System.out.println("hi");
        int [] arr=A;
        int ch[]=new int [arr.length];

        for(int i=0;i<arr.length;i++)
        {
            ch[i]=arr[i];
        }

        int count=0;
        while(count<=K){
        int j=0;
        int i=0;
        for( i=0;i<arr.length;i++)
        {
            if((i+1)<arr.length){
            arr[j]=ch[i+1];
            j++;}
        }
        if(i<arr.length){
        arr[j]=ch[i];
        count++;}
        }


         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }


        return arr;
    }
}
