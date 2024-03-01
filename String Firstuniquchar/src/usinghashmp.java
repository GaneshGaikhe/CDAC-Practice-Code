import java.util.HashMap;
import java.util.Map;

public class usinghashmp 
{


	public static void main(String[] args) {
		int num=isunique("akash");
		System.out.println(num);
	}
	
	static int isunique(String s)
	{
		char [] arr=s.toCharArray();
		Map<Character,Integer>maps=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(maps.containsKey(s.charAt(i)))
			{
				maps.put(s.charAt(i), maps.get(s.charAt(i))+1);
			}
			else
			{
				maps.put(s.charAt(i),1);
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(maps.get(s.charAt(i))==1)
			{
				return i;
			}
		}
		return -1;
		
		

		
		
	}
}
