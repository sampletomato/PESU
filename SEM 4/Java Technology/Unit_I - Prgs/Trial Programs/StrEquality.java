public class StrEquality {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new String("ABC");
        System.out.println("Using ==: " + (s1 == s2));
        System.out.println("Using equals: " + (s1.equals(s2)));
    }
}
