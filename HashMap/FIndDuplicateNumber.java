package HashMap;
import java.util.*;
public class FIndDuplicateNumber {
    public static int duplicate(int [] nums)
    {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(set.contains(nums[i]))
            {
                return nums[i];
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return -1;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        int ans = duplicate(nums);
        System.out.println("The answer is : " + ans);
    }
}
