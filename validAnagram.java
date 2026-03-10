// Input: s = "racecar", t = "carrace"
// Output: true

import java.util.Arrays;

public class validAnagram {
    public static void main(String[]args)
    {
        String s = "racecar";
        String t = "carrace";
        char c1[] = s.toCharArray();
    char c2[] = t.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    String s1 = String.valueOf(c1);
    String s2 = String.valueOf(c2);
    System.out.println(s1.equals(s2));
    }
    
    
}
