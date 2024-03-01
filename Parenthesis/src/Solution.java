import java.util.Stack;

public class Solution
{
	 public static void main(String[] args) {
		
		 
		 
		
		 
		 
		 System.out.println(check("[()}]"));
		 
		 
	}
	 
	 
	 public static String check(String s)
	 {
		 		 
		 char [] arr=s.toCharArray();
		 Stack<Character>stack=new Stack<>();
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 char currentchar=arr[i];
			 if(currentchar=='[' || currentchar=='{' || currentchar=='(')
			 {
				stack.push(currentchar); 
			 }
			 else
			 {
				 if(stack.empty())
				 {
					 return "NO";
				 }
				 
				 char topchar=stack.pop();
				 if(topchar=='[' && currentchar!=']') {return "NO";}
				 if(topchar=='{' && currentchar!='}') {return "NO";}
				 if(topchar=='(' && currentchar!=')') {return "NO";}
			 }
			 
	 }
		 return stack.isEmpty() ? "YES" : "NO";
	 }
	 
}


//import java.util.Stack;
//
//class Solution {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.check("{[()]}")); // Should print "YES"
//        System.out.println(solution.check("{[()]"));   // Should print "NO"
//    }
//
//    public String check(String s) {
//        char[] arr = s.toCharArray();
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            char currentChar = arr[i];
//            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
//                stack.push(currentChar);
//            } else 
//            {
//                if (stack.isEmpty()) {
//                    return "NO";
//                }
//
//                char topChar = stack.pop();
//                if ((currentChar == ')' && topChar != '(') ||
//                    (currentChar == ']' && topChar != '[') ||
//                    (currentChar == '}' && topChar != '{')) 
//                {
//                    return "NO";
//                }
//            }
//        }
//
//        // After processing all characters, the stack should be empty for a balanced string.
//        return stack.isEmpty() ? "YES" : "NO";
//    }
//}
