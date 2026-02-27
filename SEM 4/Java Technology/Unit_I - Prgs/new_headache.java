class NewHeadache {
    public static void main(String[] args) {
        Integer a = -127;
        Integer b = 128;
        int c = a;
        System.out.println("Hash Codes: ");
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        if(a == b) System.out.println("Equal");
        else System.out.println("Unequal");
    }
}