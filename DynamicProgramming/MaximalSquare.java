package DynamicProgramming;
import java.util.*;
public class MaximalSquare {
    public static int maxSquare(char [][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];
        int maxSide = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                }
                else if (matrix[i][j] == '1') {
                    dp[i][j] = 1 + Math.min(
                            dp[i - 1][j - 1],
                            Math.min(dp[i - 1][j], dp[i][j - 1])
                    );
                }
                else {
                    dp[i][j] = 0;
                }

                maxSide = Math.max(maxSide, dp[i][j]);
            }
        }

        return maxSide * maxSide;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int m = sc.nextInt();
        System.out.println("Enter no. of cols ");
        int n = sc.nextInt();
        char [][] matrix = new char[m][n];
        // enter character
        System.out.println("Enter matrix 0 or 1 :");
        for(int i=0;i<m;i++)
        {
             for(int j=0;j<n;j++)
             {
                  matrix[i][j] = sc.next().charAt(0);
             }
        }
        int ans = maxSquare(matrix);
        System.out.println("The answer is : " + ans);
    }
}
