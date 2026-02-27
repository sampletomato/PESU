import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        for(char c: s.toCharArray())
            System.out.println(c);
        System.out.println(revString(s));
    }
    static String revString(String s) {
        String r = "";
        for(int i = s.length() - 1; i > -1; i--)
            r += s.charAt(i);
        return r;
    }
}
