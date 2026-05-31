package Java8Features;
import java.util.*;
@FunctionalInterface
interface add{
    int sum(int a,int b);
}
public class LambdaExpressionWithTwoParameter {
    public static void main(String[] args) {
        add obj = (a,b) -> {
            return a+b;
        };
        System.out.println(obj.sum(10,20));
    }
}
