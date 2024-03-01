
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/////////charAt()
		String s="ganesh";
		char a=s.charAt(0);
		
		
		
		///////////////// 
		//compareTo()
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
	
	
		
		/////////////////////////////////
		//concat
		String s11="java string";    
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.
		
		s11.concat("is immutable");    
		
		System.out.println(s11); 
		
		s11=s11.concat(" is immutable so assign it explicitly");    
		System.out.println(s11);    
		
		
		
		String strz= "Country";  
		  
		// we have added the string "India is my" before the String str;  
		// Also, observe that a string literal can also invoke the concat() method  
		String sz = "India is my ".concat(strz);  
		  
		// displaying the string  
		System.out.println(sz);  
		
		
		
		
		
	}

}
