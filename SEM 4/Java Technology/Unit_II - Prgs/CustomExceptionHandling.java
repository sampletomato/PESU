import java.util.*;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
        System.out.println("Custom Exception Thrown");
    }
} 
// InvalidAgeException is a Checked Exception
// Since it is a child of Exception, like other Checked Exceptions
// Handle InvalidAgeException with try-catch or with throws
public class CustomExceptionHandling {
    public static void main(String[] args) {
        try {
            int age = new Scanner(System.in).nextInt();
            if(age < 0 || age > 100) 
                throw new InvalidAgeException("Invalid Age");
            else
                System.out.println("Valid Age");
        } catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch(InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }
    }
}
