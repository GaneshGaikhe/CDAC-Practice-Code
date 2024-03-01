
public class Solution {
	public static void main(String[] args) 
	{
		String input = "the sky is blue";
		System.out.println(input);
	
		System.out.println(	reverseWords(input));
	}
	
public static String reverseWords (String s)
{
	String input=s;
	
	input  = input.replaceAll("\\s+", " ");
	//System.out.println(trimmed);
	System.out.println(input);
	
	char [] ip=input.toCharArray();
	char [] arr=new char[ip.length];

	
	int j=0;
	for(int i=ip.length-1;i>=0;i--)
	{
		
		if(ip[i] == ' ')
		{
			int z=i;
			z++;
			while((z < ip.length) && (ip[z] !=' ') )
			{
				arr[j]=ip[z];
				j++;
				z++;
			}
			
			j++;
			if(j<arr.length) {
			arr[j]=' ';}
			
		}
	}
	
	int z = 0;
    while (z < ip.length && ip[z] != ' ') {
        arr[j] = ip[z];
        j++;
        z++;
    }
	
	
	return new String (arr);
}

}
