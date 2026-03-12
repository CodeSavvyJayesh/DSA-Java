package HashMap;
import java.util.*;
public class ContainsDuplicate {
    public static boolean duplicate(int [] nums)
    {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int num = nums[i];
            if(set.contains(num))
            {
                return true;
            }
            else
            {
                set.add(num);
            }
        }
        return false;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        boolean ans = duplicate(nums);
        System.out.println("The answer is : " + ans);
    }

}
