import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        

        List<Integer>l1=new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                l1.add(nums[i]);
            }
        }
      
		return l1;


    }
    
    
    public static void main(String[] args) {
		int [] r={1,1,2,55,55,100};
    List l1=	findDuplicates(r);
    	  System.out.println(l1);
	}
}