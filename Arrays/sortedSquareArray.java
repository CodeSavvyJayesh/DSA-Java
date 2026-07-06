package Arrays;
import java.util.*;
public class sortedSquareArray {
    public static int [] sortedSquare(int [] nums)
    {
         int n = nums.length;
         for(int i=0;i<n;i++)
         {
              nums[i]*=nums[i];
         }
         Arrays.sort(nums);
         return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int [] ans = sortedSquare(nums);
        for(int i=0;i<ans.length;i++)
        {
             ans[i] = nums[i];

        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
