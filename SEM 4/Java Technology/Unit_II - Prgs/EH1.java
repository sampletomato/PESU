import java.util.Scanner;
public class EH1 {
    public static void main(String[] args) {
        try {
            int x = new Scanner(System.in).nextInt();
            System.out.println(x);
        }
        catch(Exception e) {}
    }
}
