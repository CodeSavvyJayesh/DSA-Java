package DynamicProgramming;
import java.util.*;
public class PascalTriangle {
    public static List<List<Integer>> pascal(int numRows)
    {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0) return result;
        int [][] dp = new int[numRows][numRows];
        for(int i=0;i<numRows;i++)
        {    List<Integer> list = new ArrayList<>();
             for(int j=0;j<=i;j++)
             {
                 if(j==0 || j==i)
                 {
                     dp[i][j] = 1;
                 }
                 else
                 {
                     dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
                 }
                 list.add(dp[i][j]);
             }
             result.add(list);
        }
        return result;

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        List<List<Integer>> ans = pascal(n);
        System.out.println("The result is : "  + ans);

    }
}
