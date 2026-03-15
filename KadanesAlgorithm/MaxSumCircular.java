package KadanesAlgorithm;
import java.util.*;
public class MaxSumCircular {
    public static int maxCircularSum(int [] nums)
    {
        // we have to use kadane algorithm twice in this problem
        int n=nums.length;
        int currentMax = nums[0];
        int maxSum = nums[0];
        int currentMin = nums[0];
        int minSum = nums[0];
        int totalSum = nums[0];
        for(int i=1;i<n;i++)
        {
            currentMax = Math.max(currentMax+nums[i],nums[i]);
            maxSum = Math.max(currentMax,maxSum);

            currentMin = Math.min(currentMin+nums[i], nums[i]);
            minSum = Math.min(currentMin,minSum);

            totalSum = totalSum + nums[i];


        }

        if(maxSum<0)
            return maxSum;
        return Math.max(maxSum,totalSum-minSum);
    }
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of an array : ");
         int n=sc.nextInt();
         int [] nums = new int[n];
         System.out.println("Enter the array elements : ");
         for(int i=0;i<n;i++)
         {
             nums[i] = sc.nextInt();
         }
         int ans = maxCircularSum(nums);
         System.out.println("The answer is : " + ans);



    }
}
