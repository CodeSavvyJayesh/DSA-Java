package SlidingWindow;
import java.util.*;
public class minimumSizeSubArraySum {
    public static int minsizesum(int [] nums,int target)
    {
        int n = nums.length;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        for(int right=0;right<n;right++)
        {
             sum += nums[right];
             while(sum>=target)
             {
                  // in this case we have to remove the left elements
                 minLength = Math.min(minLength,right-left+1);
                 int leftNum = nums[left];
                 sum-=leftNum;
                 left++;
             }
        }
        if(minLength==Integer.MAX_VALUE) return 0;

        return minLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target element : ");
        int target = sc.nextInt();
        int size = minsizesum(nums,target);
        System.out.println("The size is : " + size);
    }
}
