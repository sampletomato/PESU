import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Check {}
class MathCalc {
    @Check
    public int add(int a, int b) {return a + b;}
}
public class CustomAnnotationDemo {
    public static void main(String[] args) {
        MathCalc m = new MathCalc();
        System.out.println("Sum: " + m.add(10, 20));
    }
}
