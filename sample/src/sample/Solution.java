package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public static void main(String[] args) {
		String str1="abcd";
		String str2="abfsh";
		
		
		String s=str1+str2;
		System.out.println(s);
		
		char [] arr=s.toCharArray();
		
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
		
		String z="";
		for(Map.Entry<Character,Integer>entry:maps.entrySet())
		{
			if(entry.getValue()==1)
			{
				z+=entry.getKey();
			}
		}
		System.out.println(z);
		
	}

}
