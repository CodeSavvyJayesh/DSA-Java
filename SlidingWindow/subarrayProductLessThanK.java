package SlidingWindow;
import java.util.*;
public class subarrayProductLessThanK {
    public static int productLess(int [] nums,int k)
    {
         if(k<=1) return 0;
         int n = nums.length;
         int left =0;
         int count = 0;
         int currentProduct = 1;
         for(int right=0;right<n;right++)
         {
              currentProduct *= nums[right];
              while(currentProduct>=k)
              {
                   currentProduct /= nums[left];
                   left++;
              }
              count += right-left+1;
         }
         return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = productLess(nums,k);
        System.out.println("The count is : " + ans);
    }
}
