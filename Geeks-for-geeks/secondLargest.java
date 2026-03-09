// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.

public class secondLargest {
    public static void main(String[]args)
    {

    int arr[] = {12,35,1,10,34,1};
    int num = findingsecondlargest(arr);
    System.out.println(num);
}
public static int findingsecondlargest(int arr[])
{
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for(int i = 0;i<arr.length;i++)
    {
        if(arr[i]>first)
        {
            second = first;
            first = arr[i];
        }
        else if(arr[i]>second && arr[i]!=first)
        {
            second = arr[i];
        }
            
        }
        return second;
        }
    }
            
      
    

