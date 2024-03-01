class Solution {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
	boolean r=	isPalindrome(s);
	System.out.println(r);
		
	}
    public static  boolean isPalindrome(String s) {
        
        //String [] arr=s.split("[^a-zA-Z0-9]");
               s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println(s);
     

					System.out.print(s);
					char [] cc=s.toCharArray();
        int left=0;
				int right=cc.length-1;


//        for(int i=0;i<cc.length;i++)
//				{
				while (left < right) {
				    if (cc[left] != cc[right]) {
				        return false;
				    }
				    left++;
				    right--;
				}

				
				return true;
        
        
        
        
        
    }
}