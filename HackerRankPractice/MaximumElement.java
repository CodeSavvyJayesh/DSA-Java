package HackerRankPractice;
import java.util.*;
public class MaximumElement {
    public static int maxElement(int [] nums)
    {
        int n = nums.length;
        int maxElement = nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]>maxElement)
            {
                maxElement = nums[i];
            }
        }
        return maxElement;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array :");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        int ans = maxElement(nums);
        System.out.println("The answer is : " + ans);

    }
}
