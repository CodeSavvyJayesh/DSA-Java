package Arrays;
import java.util.*;
public class DefuseBomb {
    public static int [] defuseBomb(int [] nums,int k)
    {
        int n = nums.length;
        int [] ans = new int[n];
        for(int i=0;i<n;i++)
        {
             int sum = 0;
             if(nums[i]==0)
             {
                 ans[i] = 0;
             }
             else if(k<0)
             {
                  for(int j=1;j<=-k;j++)
                  {
                       sum += nums[(i-j+n)%n];
                  }
                  ans[i] = sum;
             }
             else {
                 for(int j=1;j<=k;j++)
                 {
                     sum += nums[(i+j)%n];
                 }
                 ans[i] = sum;
             }
        }
        return ans;
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
        int [] answer = defuseBomb(nums,k);
        for(int i=0;i<answer.length;i++)
        {
            System.out.println(answer[i]);
        }
    }
}
