public class Solution1 {
    public static void main(String[] args) {
        String input = "the sky     is blue  ";
        System.out.println(input);
        reverseWords(input);
    }

    public static String reverseWords(String s) {
        // Split the input string into words using space as the delimiter
    	//s=s.replaceAll("\\s+"," ");
    	System.out.println(s);
        String[] words = s.split("\\s+");
       
      
       
        
       //  Reverse the order of the words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a space unless it's the last word
            }
        }
        
        System.out.println(reversed );

        String op=reversed.toString().trim();
        System.out.println(op );

      
        
        return op;
    }
}
