package HashMap;
import java.util.*;
public class twoSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int [] ans = twoSum(nums,target);
        System.out.println("The answer is : " + Arrays.toString(ans));

    }
    public static int [] twoSum(int [] nums,int target)
    {
         int n = nums.length;
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<n;i++)
         {
              int num = nums[i];
              int complement = target - num;
              if(map.containsKey(complement))
              {
                   return new int[]{map.get(complement),i};
              }
              else {
                  map.put(num,i);
              }
         }
         return new int[]{-1,-1};
    }
}
