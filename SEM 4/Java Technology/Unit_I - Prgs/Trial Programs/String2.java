public class String2 {
    public static void main(String[] args) {
        String s = "   Pack my box with five dozen liquor jugs my  ";
        System.out.print("\033[H\033[2J");
        System.out.println(s);
        String s1 = s.replace("my", "your");
        System.out.println(s1);
        System.out.println(s.indexOf("my"));
        System.out.println(s.trim());
    }
}
