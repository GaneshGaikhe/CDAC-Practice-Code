public class Solution3 {
    public static void main(String[] args) {
        String input = "the sky     is blue  ";
        System.out.println(input);
        reverseWords(input);
    }

    public static String reverseWords(String s) {
        // Split the input string into words using space as the delimiter
        String[] words = s.split("\\s+");
       
        // Reverse the order of the words using an array
        int len = words.length;
        System.out.println(len);
        
        for(int i=0;i<words.length;i++)
        {
        	System.out.print(words[i]+" ");
        }
        
        String[] reversedWords1 = new String[len];
        int j=0;
        for (int i = words.length-1; i >=0 ; i--) {
        	reversedWords1[j] = words[i];
            j++;
        }
        
        System.out.println();
        
        for(int i=0;i<reversedWords1.length;i++)
        {
        	System.out.print(reversedWords1[i]);
        }
        
        System.out.println();
       //  Join the reversed words back together with spaces
        String op = String.join(" ", reversedWords1);
        op=op.trim();
        
        System.out.println(op);
        System.out.println(op.length());
        
        return op;
    }
}
