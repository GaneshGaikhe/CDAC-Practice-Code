import java.util.Arrays;

public class Stringsort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stringsort2 obj =new Stringsort2();
		String result=obj.display("ganesh");
		System.out.println(result);

	}
	
	
	
	String display(String abc)
	{
		char [] abcd=abc.toCharArray();
		
		Arrays.sort(abcd);
		return new String(abcd);
	}

}
