package TwoPointer;
import java.util.*;
public class FourSum {
    public static List<List<Integer>> FourSum(int [] nums,int target)
    {   Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        // we hvae to use nested loop approach
        for(int i=0;i<n-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
             for(int j=i+1;j<n-2;j++)
             {
                 if(j>i+1 && nums[j]==nums[j-1]) continue;

                  int left = j+1;
                  int right = n-1;
                  while(left<right)
                  {
                       long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                       if(sum==target)
                       {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[left]);
                            list.add(nums[right]);
                            result.add(list);
                            left++;
                            right--;

                            while(left<right && nums[left]==nums[left-1]) left++;
                            while(left<right && nums[right]==nums[right+1]) right--;


                       }
                       else if(sum<target)
                       {
                           left++;
                       }
                       else
                       {
                           right--;
                       }

                  }
             }
        }
        return result;
    }
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of an array : ");
         int n = sc.nextInt();
         int [] nums = new int[n];
         System.out.println("Enter the array elements :");
         for(int i=0;i<n;i++)
         {
              nums[i] = sc.nextInt();
         }
         System.out.println("Enter the target : ");
         int target = sc.nextInt();
         List<List<Integer>> answer = FourSum(nums,target);
         System.out.println("The answer is : " + answer);
    }
}
