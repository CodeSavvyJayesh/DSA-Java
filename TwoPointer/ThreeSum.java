package TwoPointer;
import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> ThreeSum(int[] nums)
    {
       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(nums);
       int n = nums.length;
       for(int i=0;i<n;i++)
       {    if(i>0 && nums[i]==nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            while(low<high)
            {
                int ans = nums[i]+nums[low]+nums[high];
                if(ans==0)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    // now we aslo have to skip the duplicates
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else if(ans<0)
                {
                     low++;
                }
                else
                {
                    high--;
                }

            }
       }
       return result;

    }
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of an array : ");
      int n=sc.nextInt();
      int [] nums = new int[n];
      System.out.println("Enter the array elements ");
      for(int i=0;i<n;i++)
      {
           nums[i] = sc.nextInt();
      }
      List<List<Integer>> result = ThreeSum(nums);
      System.out.println("The result is : " + result);
    }
}
