import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static void main(String[] args) {
		
		
		
		int [] arr= {1,2,55,4,3,2,5,6,888,888,888,888,888,44,888,888,77,99,66,77,99,99,99,99,99};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int [] newarr=new int[arr.length];
		int k=0;
		for(int j=arr.length-1;j>=0;j--)
		{
			newarr[k]=arr[j];
					k++;
		}
		
		for(int i=0;i<newarr.length;i++)
		{
			System.out.print(newarr[i]+" ");
		}
		
		Map<Integer,Integer>maps=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(maps.containsKey(arr[i]))
			{
				maps.put(arr[i], maps.get(arr[i])+1);
			}
			else
			{
				maps.put(arr[i], 1);
			}
		}System.out.println();
		
		int maxvalue=0;
		int maxkey=0;
		for(Map.Entry<Integer,Integer>entry:maps.entrySet())
		{
			System.out.println(entry.getKey()+"  =  "+entry.getValue());
			if(entry.getValue()>maxvalue)
			{
				maxvalue=entry.getValue();
				maxkey=entry.getKey();
			}
		}
		System.out.println(maxkey+"  "+maxvalue);
		
		int p=0;
		for(Map.Entry<Integer,Integer>entry:maps.entrySet())
		{
			
			arr[p]=entry.getKey();
			p++;
		}
		
		for(int u=p;u<arr.length;u++)
		{
			arr[u]=0;
		}
		
		
		
		
		
		System.out.println();
		for(Map.Entry<Integer,Integer>entry:maps.entrySet())
		{
			
			System.out.print(entry.getKey()+" ");
		}
		System.out.println();
		
	//	Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		int result=0;
				System.out.println();
		
					for(Map.Entry<Integer,Integer>entry:maps.entrySet())
				{
						//int z=0;
					if(entry.getKey()==99)
					{
						 result=entry.getValue();
						System.out.println(entry.getValue());
					}
				}
		
		
					System.out.println(result);
					
	
		
	}

}
