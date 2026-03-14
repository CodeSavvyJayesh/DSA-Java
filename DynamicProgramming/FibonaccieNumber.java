package DynamicProgramming;
import java.util.*;
public class FibonaccieNumber {
    public static int fib(int n)
    {
        // we have to solve this problem using dp appraoch

        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++)
        {
             dp[i] = dp[i-1] + dp[i-2];

        }
        return dp[n];
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int ans = fib(n);
        System.out.println("The answer is : " + ans);
    }
}
