package SlidingWindow;
import java.util.*;
public class ContainsDuplicateII {
    public static boolean duplicate(int [] nums,int k)
    {
         int n = nums.length;
         HashSet<Integer> set = new HashSet<>();
         int left = 0;
         for(int right=0;right<n;right++)
         {
              if(set.contains(nums[right]))
              {
                   return true;
              }
              set.add(nums[right]);

              if(right-left>=k)
              {
                   set.remove(nums[left]);
                   left++;
              }
         }
         return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean ans = duplicate(nums,k);
        System.out.println("The answer is : " + ans);
    }
}
