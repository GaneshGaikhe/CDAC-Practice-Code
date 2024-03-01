
public class Solution {
	public static void main(String[] args) {
		
		
		
		int count=0;
		String s="a2b3";
		int value=2;
		
		for(int i=1;i<s.length();i=i+2)
		{
			
			count += Character.getNumericValue(s.charAt(i));
			
			if(count >= value)
			{
				System.out.println(s.charAt(i-1));
				return ;
			}
			
			
		}
		System.out.println("-1");
	}

}
