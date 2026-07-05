package TwoPointer;
import java.util.*;
public class DIStringMatch {
    public static int [] match(String s)
    {
         int n = s.length();
         int [] perm = new int[n+1];
         int low = 0;
         int high = n;
         for(int i=0;i<n;i++)
         {
             if(s.charAt(i)=='I')
             {
                  // in this case we have to make sure that we are
                  perm[i] = low;
                  low++;
             }
             else {
                 perm[i] = high;
                 high--;
             }
         }
         perm[n] = low;

         return perm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // enter stirng
        System.out.println("Enter a stirng : ");
        String s = sc.nextLine();
        int [] ans = match(s);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
