package Strings;
import java.util.*;
public class maxManhttanDist {
    public static int distance(String s)
    {
        int n = s.length();
        int x = 0;
        int y = 0;
        int wild = 0;
        // we have to think about the characters
        for(int i=0;i<n;i++)
        {
             char ch = s.charAt(i);
             if(ch=='U')
             {
                 y--;
             }
             else if(ch=='L')
             {
                 x--;
             }
             else if(ch=='R')
             {
                 x++;
             }
             else if(ch=='D')
             {
                 y++;
             }
             else {
                 wild++;
             }

        }
        // here we have to return
        return Math.abs(x)+Math.abs(y)+wild;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        // now we have string
        int ans = distance(s);
        System.out.println("The max Distance is : " + ans);
    }
}
