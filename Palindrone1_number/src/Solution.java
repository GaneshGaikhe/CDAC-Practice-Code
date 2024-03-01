
public class Solution {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Solution sol=new Solution();
	boolean r1=	sol.ispallindrone(121);
	boolean r2=		sol.ispallindrone(-121);
	boolean r3=sol.ispallindrone(500);
	
	System.out.println(r1+" "+r2+" "+r3);
		

	}
	
	public boolean ispallindrone(int num)
	{
		
		int number=num;
		String numstring=String.valueOf(num);
		int left=0;
		int right=numstring.length()-1;
		
		while(left<right)
		{
			if(numstring.charAt(left)!=numstring.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
		
		
		
	}

}
