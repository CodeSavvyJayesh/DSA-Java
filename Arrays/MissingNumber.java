package Arrays;
import java.util.*;
public class MissingNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the elements ");
        for(int i=0;i<n;i++)
            {
                nums[i]=sc.nextInt();
            }
        int ans = missingNumber(nums);
        System.out.println("The answer is : " + ans);

    }
    public static int missingNumber(int []nums)
    {
         int n = nums.length;
         int sum1 = (n*(n+1))/2;
         int sum2 = 0;
         for(int i=0;i<n;i++)
         {
              sum2 = sum2+nums[i];
         }
        return sum1-sum2;
    }

}
