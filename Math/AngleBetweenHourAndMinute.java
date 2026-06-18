package Math;
import java.util.*;
public class AngleBetweenHourAndMinute {
    public static double angle(int hour,int minutes)
    {
        double angle = Math.abs(30*hour - 5.5*minutes);
        double ans = Math.min(angle,360-angle);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hour :");
        int hour = sc.nextInt();
        System.out.println("Enter the minutes :");
        int minutes = sc.nextInt();
        double ans = angle(hour,minutes);
        System.out.println("The angle is : " + ans);
    }
}

