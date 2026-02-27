import java.util.InputMismatchException;
import java.util.Scanner;
public class ArithExceptionDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a/b);
            System.out.println(a%b);
        }
        catch(InputMismatchException e) {
            System.out.println("Int only allowed");
        }
        catch(ArithmeticException e) {
            System.out.println("Div by 0");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");
        }
    }    
}
