
public class Solution2 
{
	static int maxProfit(int [] prices)
	{
		if(prices==null || prices.length<=1)
		{
			return 0;
		}
		
		int minprice=prices[0];
		int maxprofit=0;
		
		
		
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i]<minprice)
			{
				minprice=prices[i];
			}
			else
			{
				int currentProfit=prices[i]-minprice;
				if(currentProfit>maxprofit)
				{
					maxprofit=currentProfit;
				}
			}
		}
		return maxprofit;
		
		
	}

	public static void main(String[] args) 
	{
		int [] arr= {1,8,0,12,0,88};
		int result=maxProfit(arr);
		System.out.println(result);
	}
}
