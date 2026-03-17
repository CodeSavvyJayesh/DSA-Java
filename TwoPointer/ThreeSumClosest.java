package TwoPointer;
import java.util.*;
public class ThreeSumClosest {
    public static int closest(int []nums, int target)
    {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2];
        // here I have to use two pointer approach
        for(int i=0;i<n-2;i++)
        {

             int low = i+1;
             int high = n-1;
             int currentSum = 0;
             while(low<high)
             {
                 currentSum = nums[i] + nums[low] + nums[high];
                 if(Math.abs(target-currentSum) < Math.abs(target - closest))
                 {
                     closest = currentSum;
                 }
                 if(currentSum == target )
                 {
                     closest = currentSum;
                     break;
                 }
                 if(currentSum < target)
                 {
                     low++;
                 }
                 else if(currentSum>target)
                 {
                     high--;
                 }
             }
        }
        return closest;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n=sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int ans = closest(nums,target);
        System.out.println("The closest element is : " + ans);
    }
}
