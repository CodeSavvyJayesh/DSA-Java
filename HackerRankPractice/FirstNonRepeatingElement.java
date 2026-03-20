package HackerRankPractice;
import java.util.*;
public class FirstNonRepeatingElement {
    public static int nonRepeatingChar(int [] nums){
        int n = nums.length;
        if(n==0)
            return -1;
        if(n==1)
            return nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(int num:nums)
        {
            if(map.get(num)==1)
            {
                return num;
            }
        }
        return -1;
    }
    public static void main(String [] args)
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
        int ans = nonRepeatingChar(nums);
        System.out.println("The answer is : " + ans);
    }
}
