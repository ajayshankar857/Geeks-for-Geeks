

// Input: s = "code"
// Output: 24
// Explanation: The ASCII values of the characters in the given string 
// are: 'c' = 99, 'o' = 111, 'd' = 100, and 'e' = 101.
// The score of s will be: |111 - 99| + |100 - 111| + |101 - 100|.
public class scoreOfString {
    public static void main(String[]args)
    {
        String s   = "code";
        int ans = score(s);
        System.out.println(ans);
    }
    public static int score(String s)
    {
        int value = 0;
        char c[] = s.toCharArray();
        for(int i = 1;i<c.length;i++)
        {
            int first = c[i];
            int second = c[i-1];
            value+=Math.abs(first-second);
        }
        return value;
    }
    
}
