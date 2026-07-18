package Math;
import java.util.*;
public class IntegerBreak {
    public static int IntBreak(int n)
    {
        if(n==2) return 1;
        if(n==3) return 2;
        int product = 1;
        while(n>4)
        {
             product *= 3;
             n-=3;
        }
        return product * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = IntBreak(n);
        System.out.println("The answer is :" + ans);
    }
}
