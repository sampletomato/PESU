public class StringHandling1 {
    public static void main(String[] args) {
        String s = "ABC", t = "ABC";
        // Checking equality with ==
        System.out.println("Using ==: ");
        System.out.println(s == t); // true
        String u = new String("ABC");
        String v = new String("ABC");
        System.out.println(s == u); // false
        System.out.println(u == v); // false
        // Checking equality with .equals() -- Correct Way
        System.out.println("Using .equals(): ");
        System.out.println(s.equals(t)); // true
        System.out.println(s.equals(u)); // true
        System.out.println(u.equals(v)); // true
        String s1 = "Old";
        String s2 = "New";
        String s3 = s1 + s2;
        // Checking equality upon concat and + operator
        String s4 = s1.concat(s2);
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true
        String s5 = s1 + s2;
        String s6 = s1.concat(s2);
        System.out.println(s3 == s5); // false
        System.out.println(s3.equals(s5)); // true
        System.out.println(s4 == s6); // false
        System.out.println(s4.equals(s6)); // true
        // Printing one char per line
        String a = "ABCD";
        for(int i = 0; i < a.length(); i++)
            System.out.println(a.charAt(i));
        
    }
}
