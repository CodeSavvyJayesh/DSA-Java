package SlidingWindow;
import java.util.*;
public class CountNiceSubarrays {
    public static int countArray(int [] nums,int k)
    {
         int n = nums.length;
         int left = 0;
         int count = 0;
         int oddCount = 0;
         for(int right=0;right<n;right++)
         {
              if(nums[right]%2==1)
              {
                   oddCount++;
              }
              while(oddCount>k)
              {
                   if(nums[left]%2==1)
                   {
                        oddCount--;
                   }
                   left++;
              }
              count += (right-left+1);
         }
         return count;
    }
    public static int niceSubarray(int [] nums,int k)
    {
          return countArray(nums,k) - countArray(nums,k-1);
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
        int ans = niceSubarray(nums,k);
        System.out.println("The answer is : " + ans);
    }
}
