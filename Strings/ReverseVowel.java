package Strings;
import java.util.*;
public class ReverseVowel {
    public static String revVowel(String s)
    {
         int n = s.length();
         StringBuilder sb = new StringBuilder();
         StringBuilder vowel = new StringBuilder();
         for(int i=0;i<n;i++)
         {
             char ch = s.charAt(i);
             if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
             {
                  vowel.append(ch);
             }
         }
         int m = vowel.length();
         for(int i=0;i<n;i++)
         {
              // now this is for sb
              char ch = s.charAt(i);
             if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
             {
                 if(m!=0)
                 {
                      sb.append(vowel.charAt(m-1));
                      m--;
                 }
             }
             else {
                 sb.append(ch);
             }
         }

         return sb.toString();
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string : ");
         String s = sc.nextLine();
         String ans = revVowel(s);
        System.out.println("The rebuilt string is : " + ans);

    }
}
