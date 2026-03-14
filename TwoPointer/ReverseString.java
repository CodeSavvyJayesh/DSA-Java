package TwoPointer;
import java.util.*;
public class ReverseString {
    public static void reverse(char[] ch){
          int n = ch.length;
          int start = 0;
          int end = n-1;
          while(start<end)
          {
               char temp = ch[start];
               ch[start] = ch[end];
               ch[end] = temp;
               start++;
               end--;
          }
    }
    public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of character array : ");
       int n = sc.nextInt();
       char [] ch = new char[n];
       System.out.println("Enter the characters");
       for(int i=0;i<n;i++)
       {
          ch[i] = sc.next().charAt(0);
       }
       reverse(ch);
       System.out.println("the reversed string is : ");
       for(int i=0;i<n;i++)
       {
           System.out.print(ch[i] + " ");
       }

    }
}
