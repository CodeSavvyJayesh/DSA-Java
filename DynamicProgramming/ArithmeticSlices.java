package DynamicProgramming;
import java.util.*;
public class ArithmeticSlices {
    public static int slices(int []nums)
    {
         int n = nums.length;
         int [] dp = new int[n];
         dp[0] = 0;
         dp[1] = 0;
         int count = 0;
         for(int i=2;i<n;i++)
         {
              if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
              {
                   count++;
                   dp[i] = count;
              }
              else {
                  count = 0;
                  dp[i] = count;
              }
         }
         int sum = 0;
         for(int i=0;i<n;i++)
         {
             sum+=dp[i];
         }
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();

        }
        int ans = slices(nums);
        System.out.println("The answer is : "+ans);
    }
}
