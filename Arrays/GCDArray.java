package Arrays;
import java.util.*;
public class GCDArray {
    public static int gcd(int [] nums)
    {
         int n = nums.length;
         int lowest = nums[0];
         int greatest = nums[0];
         for(int i=1;i<n;i++)
         {
              if(nums[i]<lowest)
              {
                   lowest = nums[i];
              }
         }
         for(int i=1;i<n;i++)
         {
             if(nums[i]>greatest)
             {
                 greatest = nums[i];
             }
         }
         int ans = finalGCD(lowest,greatest);
         return ans;
    }
    public static int finalGCD(int lowest,int greatest)
    {
        while(greatest!=0)
        {
             int temp = greatest;
             greatest = lowest%greatest;
             lowest = temp;
        }
        return lowest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        int ans = gcd(nums);
        System.out.println("The answer is : " + ans) ;
    }
}
