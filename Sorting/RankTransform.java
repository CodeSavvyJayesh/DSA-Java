package Sorting;
import java.lang.reflect.Array;
import java.util.*;
public class RankTransform {
    public static int [] rank(int [] nums)
    {
        // we will be given first unsorted / array
        // we have to make a copy of that array
        // we have to sort that array using Arrays.sort()
        // then we have to use the hashamp and put that sorted array elements in that map... map.values() will be rank
        // the element should be unique... then only assign the rank else same rank will be given

        int n = nums.length;
        int [] temp = new int[n];
        for(int i=0;i<n;i++)
        {
             temp[i] = nums[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i=0;i<n;i++)
        {    int num = temp[i];
             if(!map.containsKey(temp))
             {
                  map.put(num,rank);
                  rank++;
             }
        }
        for(int i=0;i<n;i++)
        {
             nums[i] = map.get(nums[i]);
        }

        return nums;

    }
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of an array  :");
         int n = sc.nextInt();
         int [] nums = new int[n];
         System.out.println("Enter the array elements : ");
         for(int i=0;i<n;i++)
         {
             nums[i] = sc.nextInt();
         }
         System.out.println("The rank transformed array is : ");
         int [] ans = rank(nums);
         for(int i=0;i<n;i++)
         {
              System.out.println(ans[i]);
         }



    }
}
