import java.util.*;
class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String msg) {
        super(msg);
        System.out.println("Custom Exception Thrown");
    }
} 
// InvalidAgeException is a Unchecked Exception
// Since it is a child of RuntimeException, 
// like other Unchecked Exceptions
// Handle InvalidAgeException with try-catch or with throws
// But, not mandatory to do so
public class CustomUncheckedExceptionHandling {
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
