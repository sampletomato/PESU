public class StringHandling4 {
    public static void main(String[] args) {
        String s = "asdfghfgfg";
        char c = 'f';
        int index = s.indexOf(c);
        System.out.println("Index of " + c + ": " + index);
        String subStr = "fg";
        index = s.indexOf(subStr);
        System.out.println("Index of " + subStr + ": " + index);
    }
}
