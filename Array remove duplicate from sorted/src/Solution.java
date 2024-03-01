import java.util.Arrays;

public class Solution {

	
	
	public static void main(String[] args) {
		int [] arr= {1,5,8,9,0,5,7,1,2,3};
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
		
		Arrays.sort(arr);
		
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
		
          int j=0;
		int [] unique=new int [arr.length];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				unique[j]=arr[i];
				j++;
			}
		}
		
		unique[j++]=arr[arr.length-1];
		
				System.out.println();
		for(int i=0;i<j;i++)
		{
			System.out.print(unique[i]);
		}
	
	
	
	
	}
}
