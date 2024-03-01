import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static void main(String[] args) {
		
		String n="ganeshizzzzzzzzzzzzzzzzzzzzzzzzzzediooiioiii";
		 
		char [] arr=n.toCharArray();
		
		Map<Character,Integer>maps=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(maps.containsKey(arr[i]))
			{
				maps.put(arr[i],maps.get(arr[i])+1);
			}
			else
			{
				maps.put(arr[i],1);
			}
		}
		
		for(Map.Entry<Character,Integer>entry:maps.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		int maxcount=0;
		char maxchar=0;
		for(Map.Entry<Character,Integer>entry:maps.entrySet())
		{
			if(entry.getValue()>maxcount)
			{
				maxcount=entry.getValue();
				maxchar=entry.getKey();
			}
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}		
		System.out.println(maxchar+"  "+maxcount);
		
		char []chh=new char [arr.length];
		int h=0;
		for(int p=arr.length-1;p>=0;p--)
		{
			chh[h]=arr[p];
			h++;
		}
		
		
		
		for(int p=0;p<arr.length;p++)
		{
			arr[p]=chh[p];
		}
		
		System.out.println();
		
		for(int p=0;p<arr.length;p++)
		{
			System.out.print(arr[p]);
		}
		
		System.out.println();
		System.out.println(n);
		
		n=String.valueOf(arr);
		
		
		System.out.println();
		System.out.println(n);
		
		
	}

}
