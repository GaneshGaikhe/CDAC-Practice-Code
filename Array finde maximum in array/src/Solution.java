import java.util.Arrays;

public class Solution
{
	public static void main(String[] args) 
	{
		int [] arr= {1,2,5,6,99,8,0,1,2};
	//	Arrays.sort(arr);
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(max < arr[i+1])
			{
				max=arr[i+1];
			}
		}
		System.out.println(max);
	}

}

/*


	int [] arr= {1,2,5,6,99,8,0,1,2};
	//	Arrays.sort(arr);
		int max=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
*/