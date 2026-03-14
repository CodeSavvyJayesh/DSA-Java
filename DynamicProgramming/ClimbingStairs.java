package DynamicProgramming;

import java.util.*;
public class ClimbingStairs {
    public static int climbingStairs(int n)
    {
        int [] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int ans = climbingStairs(n);
        System.out.println("The answer is " + ans);
    }
}
