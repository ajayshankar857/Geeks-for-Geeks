// Input: arr[] = [1, 2, 3, 5]
// Output: 4
// Explanation: All the numbers from 1 to 5 are present except 4.

import java.util.*;
class missingArray {
    public static void main(String[]args)
    {

    int arr[] = {1,2,3,5};
    int n = missingNum(arr);
    System.out.println(n);
}

    static int missingNum(int arr[]) {
      Arrays.sort(arr);
      for(int i = 0;i<arr.length;i++)
      {
          if(arr[i]!=i+1)
          {
              return i+1;
          }
      }
      return arr.length+1;
        
    }
}