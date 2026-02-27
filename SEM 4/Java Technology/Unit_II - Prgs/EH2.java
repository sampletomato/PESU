import java.util.InputMismatchException;
import java.util.Scanner;
public class EH2 {
    public static void main(String[] args) {
        String s = "asdfghjk";
        try {
            int pos = new Scanner(System.in).nextInt();
            System.out.println(s.charAt(pos));
        }
        catch(InputMismatchException e) {
            System.out.println("Int only");
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out of Bounds");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e);
        }
    }
}
