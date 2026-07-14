package HashMap;
import java.util.*;
public class LongestHarmonicSubsequence {
    public static int sequence(int [] nums)
    {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
             if(map.containsKey(nums[i]))
            {
                 map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int maxLenght = 0;
        for(int key:map.keySet())
        {
             if(map.containsKey(key+1))
             {
                  maxLenght = Math.max(maxLenght,map.get(key)+ map.get(key+1));
             }
        }
        return maxLenght;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int ans = sequence(nums);
        System.out.println(ans);
    }
}
