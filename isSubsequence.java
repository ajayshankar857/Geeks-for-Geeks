// Input: s = "node", t = "neetcode"
// Output: true

public class isSubsequence {
    public static void main(String[]args)
    {
        String s = "node";
        String t = "neetcode";
        int i = 0;
        int j = 0;

        while(i<s.length()&&j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            j++;
        }
        if(i==s.length())
        {
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }
    }

    
}
