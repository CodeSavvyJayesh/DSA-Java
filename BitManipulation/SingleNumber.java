package BitManipulation;
import java.util.*;
public class SingleNumber {
    public static int singleNum(int [] nums)
    {
        int n = nums.length;
        int ans = 0;
        for(int num : nums) {
            ans = ans ^ num;
        }
        return ans;
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
        int ans = singleNum(nums);
        System.out.println("The answer is : " + ans);
    }
}
