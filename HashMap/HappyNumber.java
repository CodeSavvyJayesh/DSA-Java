package HashMap;
import java.util.*;
public class HappyNumber {
    public static boolean happyNumber(int n)
    {
        if(n<0)
            return false;
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            int sum =0;
            while(n>0)
            {
                 int digit = n%10;
                 sum+=digit*digit;
                 n/=10;

            }
            n = sum;
        }
        boolean answer = (n==1)?true:false;
        return answer;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        boolean ans = happyNumber(n);
        System.out.println("The answer is : " + ans);


    }
}
