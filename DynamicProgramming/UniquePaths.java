package DynamicProgramming;
import java.util.*;
public class UniquePaths {
    public static int uniquePaths(int m, int n)
    {
        // we have to use 2D dp
        int [][] dp = new int[m][n];
        for(int i=0;i<m;i++)
        {
             for(int j=0;j<n;j++)
             {
                  if(i==0 && j==0)
                  {
                      dp[i][j] = 1;
                  }
                  else if(i==0)
                  {
                       dp[i][j] = 1;
                  }
                  else if(j==0)
                  {
                      dp[i][j] = 1;
                  }
                  else
                  {
                       // this will consist of recurrence relation
                      // compute top + left
                       dp[i][j] = dp[i-1][j] + dp[i][j-1];
                  }
             }
        }
        return dp[m-1][n-1];

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int n = sc.nextInt();
        int ans = uniquePaths(m,n);
        System.out.println("The total no. of unique paths are : " + ans);
    }
}
