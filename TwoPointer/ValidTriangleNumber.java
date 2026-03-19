package TwoPointer;

import java.util.*;
public class ValidTriangleNumber {
    public static int validTriangleNumber(int [] nums)
    {
        Arrays.sort(nums);
        int n = nums.length;
        if(n<3)
            return -1;
        int count = 0;
        for(int i=n-1;i>=2;i--)
        {
            int low = 0;
            int high = i-1;
            while(low<high)
            {
                 if(nums[low]+nums[high]>nums[i])
                 {
                     count += high-low;
                     high--;
                 }
                 else
                 {
                     low++;
                 }
            }
        }
        return count;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int ans = validTriangleNumber(nums);
        System.out.println("The answer is : " + ans);
    }
}
