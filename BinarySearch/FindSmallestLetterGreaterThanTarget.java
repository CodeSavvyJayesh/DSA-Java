package BinarySearch;
import java.util.*;
public class FindSmallestLetterGreaterThanTarget {
    public static char nextGreatChar(char [] letters,char target)
    {
        int n = letters.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high)
        {
             int mid = low + (high-low)/2;
             if(letters[mid]>target)
             {
                 ans = mid;
                 high = mid-1;
             }
             else {
                 low = mid+1;
             }
        }
        if(ans==-1) return letters[0];

        return (char)letters[ans];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [] letters = new char[n];
        for(int i=0;i<n;i++)
        {
             letters[i] = sc.next().charAt(0);
        }
        char target = sc.next().charAt(0);
        char ans = nextGreatChar(letters,target);
        System.out.println("The ans : " + ans);
    }
}
