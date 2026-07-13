package SlidingWindow;
import java.util.*;
public class SubstringSizeThreeDistinctChar {
    public static int count(String s)
    {
        int n = s.length();
        int left = 0;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0;right<n;right++)
        {
             while(set.contains(s.charAt(right)))
             {
                  set.remove(s.charAt(left));
                  left++;
             }

             set.add(s.charAt(right));

             if(right-left+1>3)
             {
                  set.remove(s.charAt(left));
                  left++;
             }
             if(right-left+1==3)
             {
                 count++;
             }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = count(s);
        System.out.println("the answer is : " + ans);
    }
}
