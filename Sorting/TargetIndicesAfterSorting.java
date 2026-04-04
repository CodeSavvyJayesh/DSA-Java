package Sorting;
import java.util.*;
public class TargetIndicesAfterSorting {
    public static List<Integer> targetIndices(int [] nums,int target)
    {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
             if(nums[i]==target)
             {
                  list.add(i);
             }
        }
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array lenght");
        int n=sc.nextInt();
        int [] nums = new int[n];
        System.out.println("enter the array elements ");
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();
        List<Integer> ans = targetIndices(nums,target);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
}
