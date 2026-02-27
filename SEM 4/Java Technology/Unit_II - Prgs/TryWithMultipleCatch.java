import java.util.*;
public class TryWithMultipleCatch {
    public static void main(String[] args) {
        try {
            int x = new Scanner(System.in).nextInt();
            System.out.println(10/x);
        } catch(ArithmeticException e) {
            System.out.println("Arith Exc");
        } catch(InputMismatchException e) {
            System.out.println("Input Mismatch");
        }
    }
}
