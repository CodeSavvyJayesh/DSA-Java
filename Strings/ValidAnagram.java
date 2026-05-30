package Strings;
import java.util.*;
public class ValidAnagram {
    // basically in this problem we are supposed to use the hashmap concept
    // we have to strore both string in their respective hashmap and then we have to check whether both hashmap are equal or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = sc.nextLine();
        System.out.println("Enter string t: ");
        String t = sc.nextLine();
        boolean ans = validAnagram(s,t);
        System.out.println("The answer is : " + ans);


    }
    public static boolean validAnagram(String s,String t)
    {
       int m = s.length();
       int n = t.length();
       if(m!=n) return false;
       HashMap<Character,Integer> map1 = new HashMap<>();
       HashMap<Character,Integer> map2 = new HashMap<>();
       // enter first string into the hashamap1
        for(int i=0;i<m;i++)
        {
            char ch = s.charAt(i);
            if(map1.containsKey(ch))
            {
                 map1.put(ch,map1.get(ch)+1);
            }
            else {
                map1.put(ch,1);
            }
        }
        // nowe we have to put the second string into the map2
        for(int i=0;i<n;i++)
        {
             char ch = t.charAt(i);
             if(map2.containsKey(ch))
             {
                 map2.put(ch,map2.get(ch)+1);
             }
             else
             {
                 map2.put(ch,1);
             }
        }
        boolean ans = map1.equals(map2)?true:false;
        return ans;
    }
}

