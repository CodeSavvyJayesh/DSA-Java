package TwoPointer;
import java.util.*;
public class TwoSumIISortedInput {
    public static int [] twoSum(int [] nums,int target)
    {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<high)
        {
             if(nums[low]+nums[high]==target)
             {
                 return new int [] {low+1,high+1};
             }
             else if(nums[low]+nums[high]<target)
             {
                 low++;
             }
             else {
                 high--;
             }

        }

        return new int[]{};
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the elements of an array :");
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        System.out.println("enter the target element");
        int target = sc.nextInt();
        int [] ans = twoSum(nums,target);
        System.out.println("The indices are: "+ ans[0]+ " " + ans[1]);
    }
}
