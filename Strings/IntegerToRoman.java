package Strings;
import java.util.*;
public class IntegerToRoman {
    public static String IntToRom(int num)
    {
        int [] values = {500,100,50,10,5,1};
        String [] Romans = {"D","C","L","X","V","I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(num>=values[i])
            {
                sb.append(Romans[i]);
                num-=values[i];
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = IntToRom(n);
        System.out.println(ans);
    }
}
