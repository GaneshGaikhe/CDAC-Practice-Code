import java.util.Arrays;

public class AnagramChecker2 
{
	boolean isanagram(String a,String b)
	{
	
		String s1=a.replaceAll("//s", "").toLowerCase();
		String s2=b.replaceAll("//s", "").toLowerCase();
		
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		char [] arr1=s1.toCharArray();
		char [] arr2=s2.toCharArray();
		
		
		
		CharArraysort(arr1);
		CharArraysort(arr2);
		
		
		return charequals(arr1, arr2);
		
		
	}
	
	
	
	static boolean charequals(char[] arr1, char[] arr2) {
		// TODO Auto-generated method stub
		
		if(arr1.length != arr2.length)
		{
			return false;
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				return false;
			}
		}
		
		return true;
	}



	static void CharArraysort(char[] arr) 
	{
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	
	}



	public static void main(String[] args)
	{
		
		String a="ganesh";
		String b="gnshae";
		
		AnagramChecker2 obj=new AnagramChecker2();
		
	boolean r=	obj.isanagram(a,b);
		if(r)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
