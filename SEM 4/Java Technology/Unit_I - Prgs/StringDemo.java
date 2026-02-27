import java.util.*;
public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("s = " + s);
        System.out.println("Length: " + s.length());
        System.out.println("Printing one char at a time: ");
        for(int i = 0; i < s.length(); i++)
            System.out.println(s.charAt(i));
        System.out.println("Reverse: ");
        String revString = "";
        for(int i = s.length() - 1; i > -1; i--)
            revString += s.charAt(i);
        System.out.println(revString);
        System.out.println("Appending a new char: " + (s + 'c'));
        System.out.println("In uppercase: " + s.toUpperCase());
        System.out.println("In lowercase: " + s.toLowerCase());
    }
    
}
