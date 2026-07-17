package DynamicProgramming;
import java.util.*;
public class maximumProductSubarray {
    public static int maxProduct(int [] nums)
    {
         int n = nums.length;
         int [] maxDp = new int [n];
         int [] minDp = new int [n];
         maxDp[0] = nums[0];
         minDp[0] = nums[0];
         for(int i=1;i<n;i++)
         {
              maxDp[i] = Math.max(nums[i],Math.max(maxDp[i-1]*nums[i], minDp[i-1]*nums[i]));
              minDp[i] = Math.min(nums[i],Math.min(maxDp[i-1]*nums[i], minDp[i-1]*nums[i]));
         }
         int maxProduct = maxDp[0];
         for(int num:maxDp)
         {
              if(num>maxProduct)
              {
                   maxProduct = num;
              }
         }
         return maxProduct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        int ans = maxProduct(nums);
        System.out.println("The answer is : " + ans);
    }
}
