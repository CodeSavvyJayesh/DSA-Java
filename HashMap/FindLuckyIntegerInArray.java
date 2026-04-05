package HashMap;
import java.util.*;
public class FindLuckyIntegerInArray {
    public static int luckyInteger(int [] nums)
    {
        int n = nums.length;
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
        // traverse through the hashmap
        int answer = -1;
        for(int key:map.keySet())
        {
             if(key==map.get(key))
             {
                  answer = Math.max(answer,key);
             }
        }
        return answer;
    }
    public static void main(String []args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        int ans = luckyInteger(nums);
        System.out.println("The lucky integer is : " + ans);
    }
}
