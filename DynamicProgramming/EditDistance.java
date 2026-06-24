package DynamicProgramming;
import java.util.*;
public class EditDistance {
    public static int editDistance(String s, String t)
    {
        int m = s.length();
        int n = t.length();
        // we have to use the dp approach
        int [] [] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                 if(i==0 && j==0)
                 {
                     dp[i][j] = 0;

                 }
                 else if(i==0 && j!=0)
                 {
                     dp[i][j] = j;
                 }
                 else if(i!=0 && j==0)
                 {
                     dp[i][j] = i;
                 }
                 else {
                     // here we have to deal with the recurrence logic
                     // we have to think about the character
                     if(s.charAt(i-1)!=t.charAt(j-1))
                     {
                          dp[i][j] = 1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                     }
                     else if(s.charAt(i-1)==t.charAt(j-1))
                     {
                         // in this case we have to make sure that we simply return i-1, j-1 character
                          dp[i][j] = dp[i-1][j-1];
                     }
                 }
            }

        }
        return dp[m][n];
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s : ");
        String s = sc.nextLine();
        System.out.println("Enter string t :");
        String t = sc.nextLine();
        int distance = editDistance(s,t);
        System.out.println("The distance is : " + distance);
    }
}
