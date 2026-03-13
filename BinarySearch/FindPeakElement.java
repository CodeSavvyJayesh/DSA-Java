package BinarySearch;
import java.util.*;
public class FindPeakElement {
    public static int peak(int []nums)
    {   int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]<nums[mid+1])
            {
                low = mid+1;
            }
            else
            {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array  :");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        int ans = peak(nums);
        System.out.println("The answer is : " + ans);
    }
}
