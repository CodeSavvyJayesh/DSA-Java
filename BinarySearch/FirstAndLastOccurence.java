package BinarySearch;
import java.util.*;
public class FirstAndLastOccurence {
    public static int [] FirstNLastOccurence(int [] nums, int target)
    {
        int n = nums.length;
        // I have to basically run a binary search algorithm twice...
        // first will be for first occurence
        // second will be for last occurence
        int first = -1;
        int last = -1;
        if(n==0 || nums==null)
        {
            return new int []{-1,-1};
        }
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
             int mid = low + (high-low)/2;
             if(nums[mid]==target)
             {
                 first=mid;
                 high = mid-1;
             }
             else if(nums[mid]<target)
             {
                 low = mid+1;
             }
             else
             {
                 high = mid-1;
             }
        }
        low = 0;
        high = n-1;
        while(low<=high)
        {
             int mid = low + (high-low)/2;
             if(nums[mid]==target)
             {
                 last = mid;
                 low = mid+1;
             }
             else if(nums[mid]<target)
             {
                  low = mid+1;
             }
             else
             {
                 high = mid-1;
             }
        }

        return new int []{first,last};

    }
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the length of an array : ");
         int n = sc.nextInt();
         int [] nums = new int [n];
         System.out.println("Enter the array elements : ");
         for(int i=0;i<n;i++)
         {
             nums[i] = sc.nextInt();
         }
         System.out.println("Enter the target element : ");
         int target = sc.nextInt();
         int [] ans = FirstNLastOccurence(nums,target);
         for(int i=0;i<ans.length;i++)
         {
             System.out.println("The indexes are : " + ans[i]);
         }
    }
}
