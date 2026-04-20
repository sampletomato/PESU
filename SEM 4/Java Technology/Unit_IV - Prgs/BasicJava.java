import java.util.Scanner;
public class BasicJava {
    public static void core(String s) {
        System.out.println("Uppercase: " + s.toUpperCase());
    }
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        core(s);
    }
}
