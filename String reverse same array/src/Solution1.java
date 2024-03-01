class Solution1 {
	
	public static void main(String[] args) {
		char[] ip = {'h','e','l','l','o'};
		reverseString(ip);
	}
	
    public static void reverseString(char[] s) {
    	

    	int left=0;
    	int right=s.length-1;
    	char temp;
    	
    	while(left<right)
    	{
    		temp=s[left];
    		s[left]=s[right];
    		s[right]=temp;
    		
    		
    		left++;
        	right--;
    	}
    	
    	
    	
    	
    	for(int i=0;i<s.length;i++)
        {
        	System.out.print(s[i]);
        }
        
    }
}