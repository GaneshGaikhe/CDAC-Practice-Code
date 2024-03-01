import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution
{
	
	public static void main(String[] args) 
	 {
		
		System.out.println(check("^vvv^"));
		System.out.println(check("^vv^"));
		System.out.println(check("^v^"));
		System.out.println(check("vvv"));

		}
		

	public static int check(String o)
	{
		String s=o;
		char [] arr=s.toCharArray();
		
		Map<Character,Integer>maps=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(maps.containsKey(s.charAt(i)))
			{
				maps.put(s.charAt(i),maps.get(s.charAt(i))+1);
			}
			else
			{
				maps.put(s.charAt(i),1);
			}
		}

		int [] bm=new int[arr.length];
		int k=0;
		for(Map.Entry<Character,Integer>entry:maps.entrySet())
		{
			bm[k]=entry.getValue();
			k++;
		}
	
		Arrays.sort(bm);
		int z=bm[bm.length-1];
		int u=arr.length;
		int result=u-z;
	//	System.out.println(u+" "+ z+" "+result);
		if(z<u)
		{
			return result;
		}
		else
			return 0;
	}

}
