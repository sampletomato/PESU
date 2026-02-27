import java.util.*;
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a/b);    
        }
        catch(ArithmeticException e) {
            System.out.println("Div by 0");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e.getClass());
            System.out.println(e);
        }
        System.out.println("Finished");
    }
}
