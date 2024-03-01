
public class Solution
{

	public static void main(String [] args)
	{


	

		int n=0;
		int count=0;
	for(int i=1;i<10;i++)
	{
		String n1=String.valueOf(i);
		char [] arr=n1.toCharArray();
	
	     for(int j=0;j<arr.length;j++)
	     {
		if(arr[j] == '7')
		{
			count++;
	
		}
	     }

	}

		System.out.println(count);
}
}