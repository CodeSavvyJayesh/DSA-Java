package HashMap;
import java.security.Key;
import java.util.*;
public class FirstUniqueCharInString {
    public static int uniqueChar(String s)
    {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {   char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
       for(int i=0;i<n;i++)
       {
            if(map.get(s.charAt(i))==1)
            {
                 return i;
            }
       }
       return -1;
    }
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String : ");
         String s = sc.nextLine();
         int ans = uniqueChar(s);
         System.out.println("The answer is : " + ans);
    }
}
