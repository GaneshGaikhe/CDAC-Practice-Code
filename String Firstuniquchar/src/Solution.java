class Solution {
	
	
	public static void main(String[] args) {
		
		int r=firstUniqChar("akasshh");
		System.out.println(r);
	}
	
    static int firstUniqChar(String s) {
	
    	
    	int [] freq=new int [25];
    	char [] chart=s.toCharArray();
    	
    	for(char c: chart)
    	{
    		freq[c-'a']++;
    	}
    	
    	for(int i=0;i<chart.length;i++)
    	{
    		if(freq[chart[i]-'a']==1)
    		{
    			return i;
    		}
    	}
    	
    	
    	
    	return -1;
     
    	
    }
}