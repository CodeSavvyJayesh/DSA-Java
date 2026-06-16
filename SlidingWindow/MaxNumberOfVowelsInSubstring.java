package SlidingWindow;
import java.util.*;
public class MaxNumberOfVowelsInSubstring {
    public static int maxVowels(String s, int k)
    {
       int n = s.length();
       int vowelCount = 0;
       int MaxVowelCount = 0;
       int left = 0;
       for(int right=0;right<n;right++)
       {
            char ch = s.charAt(right);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                // we have to incrase the count
                vowelCount++;
            }
            // we have to think about the 2 condi
           if(right-left+1>k)
           {
                char leftChar = s.charAt(left);
                if(leftChar=='a' || leftChar=='e' || leftChar=='i' ||
                leftChar=='o' || leftChar=='u')
                {
                    vowelCount--;
                }
                left++;
           }
           if(right-left+1==k)
           {
               // I have to update the maxVowelCount
               MaxVowelCount = Math.max(MaxVowelCount,vowelCount);
           }
       }
       return MaxVowelCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = sc.nextLine();

        System.out.println("Enter value of K ");
        int k = sc.nextInt();

        int ans = maxVowels(s,k);
        System.out.println("The answer is : " + ans);


    }
}
