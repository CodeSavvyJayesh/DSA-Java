package PrefixSum;
import java.util.*;
public class ContinuousSubarraySum {
    public static boolean subarraySum(int [] nums,int k)
    {
         int n = nums.length;
         HashMap<Integer,Integer> map = new HashMap<>();
         map.put(0,-1);
         int prefix = 0;
         for(int i=0;i<n;i++)
         {
              prefix+=nums[i];
              int rem = prefix % k;
              if(!map.containsKey(rem))
              {
                  map.put(rem,i);
              }
              else {
                  if(i-map.get(rem)>=2)
                  {
                       return true;
                  }
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
        boolean ans = subarraySum(nums,k);
        System.out.println("The answer is : " + ans);
    }
}
