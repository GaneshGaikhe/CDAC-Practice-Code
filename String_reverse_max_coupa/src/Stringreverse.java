import java.util.Arrays;

public class Stringreverse
{
	
	public static void main(String[] args) 
	{
	String r=	stringreverse("aeebcaa");
	System.out.println(r);
	}
	
	static String stringreverse(String sample)
	{

		String s=sample;
//		 StringBuilder reverse =new StringBuilder(s);
//		 reverse.reverse();
//		 System.out.println(reverse);
		
		int j=0;
		char [] arr=s.toCharArray();
		char [] charr=new char[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			charr[j]=arr[i];
			j++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			//System.out.print(arr[i]);
		}
		
		
		
		System.out.println();
		for(int i=0;i<charr.length;i++)
		{
			//System.out.print(charr[i]);
		}
		
		
		
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			//System.out.print(arr[i]);
		}
		
		
		int maximumcount=0;
		char maxchar=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			
			int currentcount=0;
			char currentchar=arr[i];
			
			for(int k=0;k<arr.length;k++)
			{
				if(currentchar==arr[k])
				{
					currentcount++;
				}
			}
			if(currentcount>maximumcount)
			{
				maxchar=currentchar;
				maximumcount=currentcount;
			}
			
			//System.out.println(currentchar+" "+currentcount);
			
		}
//		System.out.println();
//		System.out.println("maximum character  "+maxchar);
//		System.out.println(maximumcount);
		String result=new String (charr)+maximumcount+maxchar;
//		System.out.println(result);
		return result;
	}
}
