package Java8Features;
import java.util.*;
// basically function interface means interface having one abstract method
@FunctionalInterface
interface Greeting{
    void sayHello();
}
public class LambdaExpression {
    public static void main(String[] args) {
        Greeting g = () -> {
            System.out.println("Hello");
        };
        g.sayHello();
    }
}
// in above eg JVM understands
/*
Greeting g = new Greeting() {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
};
*/



