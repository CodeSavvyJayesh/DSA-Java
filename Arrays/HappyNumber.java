package Arrays;
import java.util.*;
public class HappyNumber {
    public static boolean isHappy(int n)
    {
        // we have to check about whether the no. is happy or not
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n))
        {    set.add(n);
             int sum = 0;
             while(n>0)
             {
                  int digit = n%10;
                  sum+=digit*digit;
                  n/=10;
             }
             n=sum;

        }
        boolean ans = (n==1)?true:false;
        return ans;
    }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the no. ");
           int n = sc.nextInt();
           boolean ans = isHappy(n);
           System.out.println("The answer is : " + ans);
    }
}
