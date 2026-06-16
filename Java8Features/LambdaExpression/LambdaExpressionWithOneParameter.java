package Java8Features.LambdaExpression;

@FunctionalInterface
interface Print{
    void display(String name);
}
public class LambdaExpressionWithOneParameter {
    public static void main(String[] args) {
        Print p = (name) -> {
            System.out.println(name);
        };

        p.display("Jayesh");

    }

}
