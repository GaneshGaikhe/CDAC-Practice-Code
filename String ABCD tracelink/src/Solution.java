import java.util.Scanner;

public class Solution 
{

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		charat(sc.nextInt());
		
	
	}
	
	static void charat(int num)
	{
	//	String a="A";
		

		int r=num%26; //R
				
		int fq=num/26;//Q
		
		fq=fq+1;
		
	
		int fr=r+64;
		
		if(r==0) 
		{
			for(int i=1;i<fq;i++)
			System.out.print('Z');
		}
		else 
		{
		
		for(int i=1;i<=fq;i++)
		{
			//System.out.println(fr);
			

			char ch =(char) fr;
			
			System.out.print(ch);
		}
		}
		
		
		//System.out.println(fq);

		
		
	}
	
	
}


