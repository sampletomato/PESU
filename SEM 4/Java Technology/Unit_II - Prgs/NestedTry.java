import java.util.*;
public class NestedTry {
    public static void main(String[] args) {
        try {
            System.out.println("Outer block");
            int x = new Scanner(System.in).nextInt();
            try {
                System.out.println("Inner try");
                System.out.println(10/x);
            } catch(ArithmeticException e) {
                System.out.println("Inner catch block");
            }
        } catch(InputMismatchException e) {
            System.out.println("Outer catch");
        }
    }
}
