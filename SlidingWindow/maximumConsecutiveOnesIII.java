package SlidingWindow;
import java.util.*;
public class maximumConsecutiveOnesIII {
    public static int maxOnes(int [] nums,int k)
    {
        int n = nums.length;
         int currentZero = 0;
         int maxOnes = 0;
         int left = 0;
         for(int right=0;right<n;right++)
         {
              if(nums[right]==0)
              {
                  currentZero++;
              }
              while(currentZero>k)
              {
                   int leftNum = nums[left];
                   if(leftNum==0)
                   {
                        currentZero--;
                   }
                   left++;
              }
              maxOnes = Math.max(maxOnes,right-left+1);

         }
         return maxOnes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++)
        {
             nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = maxOnes(nums,k);
        System.out.println("The answer is : " + ans);
    }
}
