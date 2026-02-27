import java.util.*;
public class ManualExceptionTrigger {
    public static void main(String[] args) {
        try {
            int age = new Scanner(System.in).nextInt();
            if(age < 18) 
                throw new ArithmeticException("Minor");
            else 
                System.out.println("Given Age: " + age);
        } catch(InputMismatchException e) {
            System.out.println("Int only");
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
