// Input: nums = [1,2,3,2,2]
// Output: 2

public class findDuplicate {
    public static void main(String[]args)
    {
        int nums[] = {1,2,3,2,2};
        int ans = duplicate(nums);
        System.out.println(ans);
    }
     public static int duplicate(int[] nums) {
        int freq[] = new int[10001];
        for(int n: nums)
        {
            freq[n]++;
            if(freq[n]>1)
            {
                return n;
            }
        }
        return -1;
    }
}
  
