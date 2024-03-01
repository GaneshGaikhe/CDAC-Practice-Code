import java.util.Arrays;

class Solution {
    public boolean Solution(String s, String t) {

        s=s.replaceAll("//s","").toLowerCase();
        t=t.replaceAll("//s","").toLowerCase();

        if(s.length()!=t.length())
        {
            return false;
        }

        char [] str1=s.toCharArray();
        char [] str2=t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);


        for(int i=0;i<str1.length;i++)
        {
            if(str1[i]!=str2[i])
            {
                return false;
            }
        }
        return true;
    }
}