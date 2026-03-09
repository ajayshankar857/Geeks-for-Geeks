// Input: nums = [1,4,1,2]
// Output: [1,4,1,2,1,4,1,2]
import java.util.*;
public class concatenationOfArray {
    public static void main(String[]args)
    {
        int nums[] = {1,4,1,2};
        int ans[] = concatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] concatenation(int nums[])
    {
         int n = nums.length;
        int arr[] = new int[n*2];
        int arr2[] = nums.clone();
        int index = 0;
        for(int i = 0;i<nums.length;i++)
        {
            arr[index++] = nums[i];
        }
        for(int i = 0;i<arr2.length;i++)
        {
            arr[index++] = arr2[i];
        }
        return arr;
        

    }
    
}
