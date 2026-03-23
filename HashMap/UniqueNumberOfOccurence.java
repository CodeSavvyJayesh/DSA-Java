package HashMap;
import java.util.*;
public class UniqueNumberOfOccurence {
    public static boolean uniqueOccurence(int [] nums)
    {    int n=nums.length;
         // in order to solve this problem we need hashmap... which will basically store the count of elements
        // also we need hashset.... we will put the map.values() in set if we found duplicate values simply return false
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {   int num = nums[i];
            if(map.containsKey(num))
            {
                 map.put(num,map.get(num)+1);
            }
            else
            {
                map.put(num,1);
            }
        }
        // we are done with full hashmap
        // now we have to store the map.values in set
        for(int val:map.values())
        {
             if(set.contains(val))
             {
                 return false;
             }
             else {
                 set.add(val);
             }
        }
        return true;
    }
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the length of an array : ");
         int n = sc.nextInt();
         int [] nums = new int[n];
         System.out.println("Enter the array elements : ");
         for(int i=0;i<n;i++)
         {
              nums[i] = sc.nextInt();

         }
         boolean ans = uniqueOccurence(nums);
         System.out.println("The answer is : " + ans);
    }
}
