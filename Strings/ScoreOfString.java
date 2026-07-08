package Strings;
import java.util.*;
public class ScoreOfString {
    public static int score(String s)
    {
         int n = s.length();
         int j = 0;
         int score = 0;
         for(int i=1;i<n;i++)
         {
              char ch1 = s.charAt(i);
              char ch0 = s.charAt(j);
              int asc1 = ch1;
              int asc0 = ch0;
              score += Math.abs(asc1-asc0);
              j++;
         }
         return score;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = score(s);
        System.out.println("The score is : " + ans);
    }
}
