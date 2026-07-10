package Arrays;
import java.util.*;
public class SpecialArrayI {
    public static boolean speicalArray(int [] nums )
    {
         int n = nums.length;
         for(int i=1;i<n;i++)
         {
              if((nums[i]%2==0 && nums[i-1]%2!=0) || (nums[i]%2!=0 && nums[i-1]%2==0))
              {
                   continue;
              }
              else
              {
                  return false;
              }
         }
         return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        boolean ans = speicalArray(nums);
        System.out.println("The answer is : " + ans);
    }
}
