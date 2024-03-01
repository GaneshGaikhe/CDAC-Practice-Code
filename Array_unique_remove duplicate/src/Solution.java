import java.util.Arrays;

public class Solution {

	
	public static void main(String[] args) {
		
		int [] arr= {5,8,9,0,2,8,1,9,3};
		int [] temparray=new int [arr.length];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			temparray[i]=arr[i];
		}
		
		for(int i=0;i<temparray.length;i++)
		{
			System.out.print(temparray[i]);
		}
		
				
		Arrays.sort(temparray);
			
		
		System.out.println();
		
		for(int i=0;i<temparray.length;i++)
		{
			System.out.print(temparray[i]);
		}
	
			int j=0;
			int [] unique=new int [temparray.length];
		for(int i=0;i<temparray.length-1;i++)
		{
			if(temparray[i] != temparray[i+1])
			{
				unique[j++]=temparray[i];
			}
		}
        unique[j++] = temparray[temparray.length - 1];

		System.out.println();
		
		for(int i=0;i<j;i++)
		{
			System.out.print(unique[i]);
		}
		System.out.println(" ");
		for(int i=0;i<unique.length;i++)
		{
			System.out.print(unique[i]);
		}
		
	}
}
