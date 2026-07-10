package Arrays;
import java.util.*;
public class MaximumAscendingSubarraySum {
    public static int maxSum(int [] nums)
    {
         int n = nums.length;
         int currentSum = nums[0];
         int maxSum = nums[0];
         for(int i=1;i<n;i++)
         {
              if(nums[i]>nums[i-1])
              {
                  currentSum+=nums[i];
              }
              else {
                  currentSum = nums[i];
              }
              maxSum = Math.max(currentSum,maxSum);
         }
         return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();

        }
        int ans = maxSum(nums);
        System.out.println("The maxsum is : " + ans );
    }
}

