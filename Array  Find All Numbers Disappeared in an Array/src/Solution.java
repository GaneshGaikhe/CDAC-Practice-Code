import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
            List<Integer>l1=new ArrayList <>();
        Arrays.sort(nums);
            for(int i=1;i<=nums.length;i++)
            {
                  int c=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(i==nums[j])
                    {
                        c++;
                    }
                } 
                if(c==0)
                {
                    l1.add(i);
                }
            }



            return l1;
    }
}