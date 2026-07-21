package Strings;
import java.util.*;
public class FizzBuzz {
    public static List<String> fizzbuzz(int n)
    {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                list.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                list.add("Fizz");
            }
            else if(i%5==0)
            {
                list.add("Buzz");
            }
            else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ans = fizzbuzz(n);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
}
