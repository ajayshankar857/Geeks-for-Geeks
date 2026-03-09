// nput: arr[] = [1, 2, 3, 7, 5], target = 12
// Output: [2, 4]
// Explanation: The sum of elements from 2nd to 4th position is 12.

import java.util.*;
import java.util.Arrays;

public class indexesOfSubarray {
    public static void main(String[]args)
    {
    int arr[] = {1, 2, 3, 7, 5};
    int target = 12;

    List<Integer> ans = subarraySum(arr,target);
    System.out.println(ans);
}
     public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list  = new ArrayList<>();
        
        int start = 0;
        int sumValue = 0;
        
        for(int i = 0;i<arr.length;i++)
        {
            sumValue+=arr[i];
            while(sumValue>target && start<=i)
            {
                sumValue-=arr[start];
                start++;
            }
             if(sumValue == target)
            {
                list.add(start+1);
                list.add(i+1);
                return list;
            }
        }
        return new ArrayList<>(Arrays.asList(-1));
    }
}

    

