
public class Solution {
	
	
	public static void main(String[] args) {
		
		String s="my        name is ganesh";
		
		char [] arr=s.toCharArray();
		char first=arr[0];
		first=Character.toUpperCase(first);
		arr[0]=first;
		//S
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				char sample=arr[i+1];
				sample=Character.toUpperCase(sample);
				arr[i+1]=sample;
			}
		}
		
		
		s=s.valueOf(arr);
		
		System.out.println(s);
		
		
		//s=s.replace(s.charAt(0),);
	//	String s1=s.substring(0, 2);
		//System.out.println(s1);
		
		
	}

}
