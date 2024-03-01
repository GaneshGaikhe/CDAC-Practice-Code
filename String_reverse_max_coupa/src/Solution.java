import java.util.Arrays;

public class Solution 
{
	
	public static void main(String[] args)
	{
		int [] arr= {1,2,55,9,7,0,5,6,55,9,99,4,100,100,100,100,101,101};
		System.out.println(arr.length);//12
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int j=0;
		int [] reverse=new int [arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			reverse[j]=arr[i];
			j++;
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(reverse[i]+" ");
		}

		
		int maximumcount=0;
		int maxnumber=0;
		
		for(int i=0;i<arr.length;i++ )
		{
			int currentcount=0;
			int currentelement=arr[i];
			
			for(int k=0;k<arr.length;k++)
			{
				if(currentelement==arr[k])
				{
					currentcount++;
				}
				
			}
			
			if(currentcount>maximumcount)
			{
				maximumcount=currentcount;
				maxnumber=currentelement;
			}
		
		}
		
		System.out.println();
		System.out.println(maximumcount);
		System.out.println(maxnumber);
		
		
		
		
		
		System.out.println(reverse+" "+maximumcount+" "+maxnumber);
		
		
		
		
		
		
		
		
		
		
		
//		Arrays.sort(arr);
//		
//		System.out.println();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		
		
	}

}
