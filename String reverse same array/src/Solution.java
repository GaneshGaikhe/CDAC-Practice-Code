class Solution {
	
	public static void main(String[] args) {
		char[] ip = {'h','e','l','l','o'};
		reverseString(ip);
	}
	
    public static void reverseString(char[] s) {
    	
        char[] s1=new char[s.length];
        int j=0;
        for(int i=0;i<s1.length;i++)
        {
            s1[i]=s[i];
        }
        
     
        
        for(int i=s1.length-1;i>=0;i--)
        {
            s[j]=s1[i];
            j++;
        }
        
        for(int i=0;i<s.length;i++)
        {
        	System.out.print(s[i]);
        }
        
        
    }
}