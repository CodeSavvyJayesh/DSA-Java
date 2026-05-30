package Arrays;

import java.util.*;
public class MoveZeroes {
    public static void moveZero(int [] nums)
    {
         int n = nums.length;
         int j=0;
         for(int i=0;i<n;i++)
         {
              if(nums[i]!=0)
              {
                  nums[j++] = nums[i];
              }
              else {
                  continue;
              }
         }
         while(j<n)
         {
              nums[j++] = 0;
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        moveZero(nums);
        for(int i=0;i<n;i++)
        {
            System.out.println(nums[i]+ " ");

        }


    }
}
