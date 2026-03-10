// Input: arr = [2,4,5,3,1,2]

// Output: [5,5,3,2,2,-1]
import java.util.*;
public class replaceGreaterElement {
    public static void main(String[]args)
    {
        int arr[] = {2,4,5,3,1,2};
        int res[] = replacedElement(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] replacedElement(int arr[])
    {
         for(int i = 0;i<arr.length-1;i++)
        {
            int value = 0;
            int max = 0;
            for(int j = i+1;j<arr.length;j++)
            {
                value = arr[j];
                max  = Math.max(max,value);
            }
            arr[i] = max;
        }
        arr[arr.length-1] = -1;
        return arr;
        
    }
    
}
