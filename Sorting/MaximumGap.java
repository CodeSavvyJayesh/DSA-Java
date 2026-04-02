package Sorting;
import java.util.*;
public class MaximumGap {
    public static int maxGap(int [] nums)
    {
         int n = nums.length;
         Arrays.sort(nums);
         int difference = Integer.MIN_VALUE;
         for(int i=1;i<n;i++)
         {
              int currentDiff = nums[i] - nums[i-1];
              if(currentDiff>difference)
              {
                   difference = Math.max(currentDiff,difference);
              }
         }
         return difference;
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
        int ans = maxGap(nums);
        System.out.println("The answer is : " + ans);
    }
}
