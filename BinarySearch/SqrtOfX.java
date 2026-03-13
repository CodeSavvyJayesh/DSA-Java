package BinarySearch;
import java.util.*;
public class SqrtOfX {
    public static int sqrt(int n)
    {
        int low = 1;
        int high = n;
        int ans =0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;

            if(mid<=n/mid)
            {
              ans = mid;    // store the answer
              low = mid+1;     // try to find bigger square root
            }
            else
            {
                high = mid-1;
            }

        }
        return high;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int ans = sqrt(n);
        System.out.println("The answer is :" + ans);

    }
}
