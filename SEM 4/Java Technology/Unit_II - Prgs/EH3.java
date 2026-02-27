import java.util.*;
public class EH3 {
    public static void main(String[] args) {
        int x;
        try {
            x = new Scanner(System.in).nextInt();
            System.out.println(10 / x);
        } catch(ArithmeticException e) {
            x = 10;
            System.out.println(10 / x);
        } catch(InputMismatchException e) {
            x = 5;
            System.out.println(10 / x);
        }
    }
}
