public class StringHandling5 {
    public static void main(String[] args) {
        String s = "Pack my box with my clothes";
        String t = s.replace("my", "your");
        System.out.println(s);
        System.out.println(t);
        String u = s.replace('y', 'q');
        System.out.println(u);
        String v = s.replace("y", "somestring");
    }
}
