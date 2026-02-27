public class StringHandling2 {
    public static void main(String[] args) {
        String s = "ABCD";
        // Print one char per line -- Using toCharArray()
        char[] arr = s.toCharArray();
        for(char c: arr) System.out.println(c);
        String s1 = new String(arr); // Create + Return new String object
        System.out.println(s); // ABCD
        System.out.println(s1); // ABCD
        System.out.println(s == s1); // false 
        System.out.println(s.equals(s1)); // true

    }
}
