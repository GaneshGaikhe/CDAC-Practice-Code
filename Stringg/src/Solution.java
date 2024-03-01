import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50};
		
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		int avg=sum/arr.length;
		System.out.println(avg);
		
		
		
		int [] a= {1,2,44,3,4,55};
		int [] b= {2,1,44,6,8,3,4};
		
		Arrays.sort(a);
		Arrays.sort(b);
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		
	}
}
