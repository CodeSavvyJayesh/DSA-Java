package Sorting;

import java.util.*;

public class CountElementWithStrictlySmallAndGreater {
    public static int countElement(int [] nums)
    {
        int n = nums.length;
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[n-1];
        int count = 0;
        for(int i=1;i<n-1;i++)
        {
            if(nums[i]!=smallest && nums[i]!=largest)
            {
                 count++;
            }
        }
        return count;
    }
    public static void main(String [] args)
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n=sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int ans = countElement(nums);
        System.out.println("The answer is : " + ans);
    }
}
