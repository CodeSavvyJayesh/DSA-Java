package PrefixSum;
import java.util.*;
public class FindPivotIndex {
    public static int pivotIndex(int [] nums)
    {
        int n = nums.length;
        int totalSum = 0;
        for(int num:nums)
        {
             totalSum+=num;
        }
        int leftSum = 0;
        for(int i=0;i<n;i++)
        {
             int rightSum = totalSum-leftSum-nums[i];
             if(leftSum == rightSum)
             {
                  return i;
             }
             leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of an array :");
      int n=sc.nextInt();
      int [] nums = new int[n];
      System.out.println("Enter the array elements: ");
      for(int i=0;i<n;i++)
      {
          nums[i] = sc.nextInt();
      }
      int ans = pivotIndex(nums);
      System.out.println("The answer is : " + ans);
    }
}
