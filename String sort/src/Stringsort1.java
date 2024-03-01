
public class Stringsort1 {

	
	String display(String abc)
	{
		char [] abcd=abc.toCharArray();
		char temp;
		
		for(int i=0;i<abcd.length;i++)
		{
			for(int j=i+1;j<abcd.length;j++)
			{
				if(abcd[i]>abcd[j])
				{
					 temp=abcd[i];
					 abcd[i]=abcd[j];
					 abcd[j]=temp;
				}
				
				
			}
		}
		return new String(abcd);
	}
	
	public static void main(String[] args) 
	{
		Stringsort1 obj=new Stringsort1();
		
		String result=obj.display("ganesh");
		System.out.println(result);
	}
}
