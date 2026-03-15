package KadanesAlgorithm;
import java.util.*;
public class MaximumSubarray {
    public static int maxSumSubArray(int [] nums)
    {
       int n = nums.length;
       int currentSum = nums[0];
       int maxSum = nums[0];
       for(int i=1;i<n;i++)
       {
            currentSum = Math.max(currentSum+nums[i], nums[i]);
            maxSum = Math.max(currentSum,maxSum);
       }
       return maxSum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int ans = maxSumSubArray(nums);
        System.out.println("The maximus subarray sum is : " + ans);
    }
}
