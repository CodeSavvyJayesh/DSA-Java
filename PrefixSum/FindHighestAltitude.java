package PrefixSum;
import java.util.*;
public class FindHighestAltitude {
    public static int highestAltitude(int [] gains)
    {
        int n =gains.length;
        int current_gain = 0;
        int max_gain = 0;
        for(int i=0;i<n;i++)
        {
             current_gain += gains[i];
             max_gain = Math.max(current_gain,max_gain);
        }
        return max_gain;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int [] gains = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            gains[i] = sc.nextInt();
        }
        int ans = highestAltitude(gains);
        System.out.println("The answer is : " + ans);
    }

}
