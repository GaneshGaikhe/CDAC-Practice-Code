import java.util.Arrays;

//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//Example 2:
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.
// 
//


class Solution {
    static int maxProfit(int[] prices) 
    {
    	//System.out.println(prices[2]);
    	int buyindex = 0;
    	int[] arr = new int[prices.length];
    


            for(int i=0;i<prices.length;i++)
            {
                arr[i]=prices[i];
            }

            
            Arrays.sort(arr);
            
            int buy=arr[0];
            
         //   System.out.println(buy);
            
            for(int i=0;i<prices.length;i++)
            {
            	if(prices[i]==buy)
            	{
            		 buyindex=i;
            	}
            }
          //  System.out.println("buy index"+ buyindex);
            
            int max=prices[buyindex];
            int sellindex=0;
           
            if(buyindex==prices.length-1)
            {
            //	System.out.println(buyindex);
            	return 0;
            }
            
            else
            {
            	for(int i=buyindex+1;i<prices.length;i++)
            	{
            		if(prices[i]>max)
            		{
            			max=prices[i];
            			sellindex=i;
            		}
            	}
            	
            	//System.out.println("maximum profit date" + max +" "+ sellindex );
    			return max-buy;

            }
            
            

    }
    
    public static void main(String[] args) {
		
    	int [] arr1= {6,1,3,2,4,7};
    //	System.out.println(arr1.length);
    	int result=maxProfit(arr1);
    	System.out.println(result);
	}
}