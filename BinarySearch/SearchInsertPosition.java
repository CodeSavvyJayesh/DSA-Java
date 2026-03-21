package BinarySearch;
import java.util.*;
public class SearchInsertPosition {
    public static int insertPosition(int [] nums, int target)
    {
         int n = nums.length;
         int low = 0;
         int high = n-1;
         if(target<nums[0])
         {
              return 0;
         }
         if(target>nums[n-1])
         {
             return n;
         }
         while(low<=high)
         {
              int mid = low + (high-low)/2;
              if(nums[mid]==target)
              {
                   return mid;
              }
              else if(nums[mid]>target)
              {
                   high=  mid-1;
              }
              else
              {
                   low = mid+1;
              }
         }
         return low;
    }
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("The size of an array : ");
         int n=sc.nextInt();
         int [] nums = new int[n];
         System.out.println("Enter the array elements : ");
         for(int i=0;i<n;i++)
         {
              nums[i] = sc.nextInt();
         }
         System.out.println("Enter the target element ");
         int target = sc.nextInt();
         int ans = insertPosition(nums,target);
         System.out.println("The position is  :" + ans);
    }
}
