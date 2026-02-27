public class StringHandling8 {
    public static void main(String[] args) {
        String s = "gfhj fghj";
        char[] a = s.toCharArray();
        for(Character c: a)
            System.out.println(c.equals('g'));
    }
}
