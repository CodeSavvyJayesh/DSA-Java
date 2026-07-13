package SlidingWindow;
import java.util.*;
public class KBeautyNumber {
    public static int kbeauty(int num,int k)
    {
         String str = String.valueOf(num);
         int count = 0;
         for(int left=0;left<=str.length()-k;left++)
         {
              int newNum = 0;
              for(int right=left;right<left+k;right++)
              {
                   newNum = newNum * 10 + (str.charAt(right) - '0');
              }
              if(newNum != 0 && num%newNum==0)
              {
                   count++;
              }
         }
         return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int ans = kbeauty(num,k);
        System.out.println(ans);

    }
}
