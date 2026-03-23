package DynamicProgramming;
import java.util.*;
public class PascalTriangleII {
    public static List<Integer> pascal2(int rowIndex)
    {
        // take a note that here index is starting from 0 to n-1
        int [] dp = new int[rowIndex+1];
        dp[0]=1;
        for(int i=1;i<=rowIndex;i++)
        {
             for(int j=i;j>0;j--)
             {
                  dp[j] = dp[j]+dp[j-1];
             }
        }
        List<Integer> result=new ArrayList<>();
        for(int val:dp)
        {
            result.add(val);
        }

        return result;

    }
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the rowIndex : ");
         int rowIndex = sc.nextInt();
         List<Integer> result = pascal2(rowIndex);
         System.out.println("The result is : " + result);
    }

}
