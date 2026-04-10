import java.util.Scanner;
import java.util.*;
public class ArrayWithGreaterElementOrEqualX {
    public static int specialArrayX(int [] nums)
    {
        int n=nums.length;
        Arrays.sort(nums);
        for(int x=1;x<=n;x++)
        {   int count = 0;
            for(int i=0;i<n;i++)
            {
                if(nums[i]>=x)
                {
                    count++;
                }
            }
            if(count==x)
                return x;

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        int ans = specialArrayX(nums);
        System.out.println("The answer is : " + ans);
    }
}
