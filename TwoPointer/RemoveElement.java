package TwoPointer;
import java.util.*;
public class RemoveElement {
    public static int removeElement(int [] nums, int val)
    {
        int n = nums.length;
        int j = 0;
        for(int i=0;i<n;i++)
        {
             if(nums[i]!=val)
             {
                  nums[j] = nums[i];
                  j++;
             }
        }
        return j;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the  array elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value to be removed from the array : ");
        int val = sc.nextInt();
        int ans = removeElement(nums,val);
        System.out.println("The length is : " + ans);
    }
}
