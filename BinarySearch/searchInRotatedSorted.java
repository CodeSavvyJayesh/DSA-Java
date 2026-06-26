package BinarySearch;
import java.util.*;
public class searchInRotatedSorted {
    public static int search(int [] nums,int target)
    {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
             if(nums[mid]==target)
             {
                 return mid;
             }
             else if(nums[mid]>=nums[low])
             {
                 if(nums[low]<=target && target<=nums[mid])
                 {
                     high = mid-1;
                 }
                 else
                 {
                     low = mid+1;
                 }
             }
             else
             {
                 if(nums[high]>=target && target>=nums[mid])
                 {
                     low = mid+1;
                 }
                 else
                 {
                     high = mid-1;
                 }
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the target element ");
        int target = sc.nextInt();
        int ans = search(nums,target);
        System.out.println("The position is : " + ans);
    }
}
