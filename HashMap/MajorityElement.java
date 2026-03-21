package HashMap;
import java.util.*;
public class MajorityElement {
    public static int majorityElement(int [] nums)
    {
         int n=nums.length;
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<n;i++)
         {
              int num = nums[i];
              if(map.containsKey(num))
             {
                 map.put(num,map.get(num)+1);
             }
              else
              {
                  map.put(num,1);
              }
         }
         for(int num:nums)
         {
              if(map.get(num)>n/2)
              {
                   return num;
              }
         }
         return -1;
    }
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the array length : ");
         int n = sc.nextInt();
         int [] nums = new int[n];
         System.out.println("Enter the array elements : ");
         for(int i=0;i<n;i++)
         {
              nums[i] = sc.nextInt();

         }
         int ans = majorityElement(nums);
         System.out.println("The majority element is : " + ans);


    }
}
