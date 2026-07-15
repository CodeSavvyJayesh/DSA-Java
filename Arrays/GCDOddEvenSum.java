package Arrays;
import java.util.*;
public class GCDOddEvenSum {
    public static int gcdOfOddEvenSums(int n)
    {
        int oddSum = n*n;
        int evenSum = n*(n+1);
        int ans = gcd(oddSum,evenSum);
        return ans;
    }
    public static int gcd(int oddSum,int evenSum)
    {
         while(evenSum!=0)
         {
              int temp = evenSum;
              evenSum = oddSum%evenSum;
              oddSum = temp;
         }
         return oddSum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = gcdOfOddEvenSums(n);
        System.out.println("The answer is : " + ans);
    }
}
