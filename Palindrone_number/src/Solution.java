class Solution {
    public boolean isPalindrome(int x) 
    {
    	
    	int abc=x;
    	String num=String.valueOf(abc);
    	int left=0;
    	int right=num.length()-1;
    	while(left<right) 
    	{
    	if(num.charAt(left)!=num.charAt(right))
    		{
    			return false;
    		
    		}
    	
    			left++;
    			right--;
    	
     	}
    		return true;
    	
	
        
    }
    
    
    public static void main(String[] args)
    {
    	Solution a=new Solution();
    boolean r1=	a.isPalindrome(121);
    boolean r2=a.isPalindrome(552);
    boolean r3=a.isPalindrome(-121);
    System.out.println(r1+    "    "+ r2+"   "+ r3);
       
    	
	}
}