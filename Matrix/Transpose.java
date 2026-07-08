package Matrix;
import java.util.*;
public class Transpose {
    public static int[][] trans(int [][] nums)
    {
         int m = nums.length;
         int n = nums[0].length;
         int [][] ans = new int[m][n];
         for(int i=0;i<m;i++)
         {
              for(int j=0;j<n;j++)
              {
                   ans[j][i] = nums[i][j];
              }
         }
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] nums = new int[m][n];
        for(int i=0;i<m;i++)
        {
             for(int j=0;j<n;j++)
             {
                 nums[i][j] = sc.nextInt();
             }
        }
        int [][] ans = trans(nums);
        for(int i=0;i<m;i++)
        {
             for(int j=0;j<n;j++)
             {
                 System.out.println(ans[i][j]);
             }
        }
    }
}
