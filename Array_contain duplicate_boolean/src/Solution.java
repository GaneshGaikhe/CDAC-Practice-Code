class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
            	int result=Math.abs((j-i));
                if((nums[i] == nums[j]) && (i != j) && (result <= k) )
                {
                	
                    System.out.println(j);
                    System.out.println(i);
                    System.out.println(i-j);
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) 
    {
		
    	int arr[]= {1,2,3,1,2,3};
    	System.out.println(containsNearbyDuplicate(arr,2));
	}
}