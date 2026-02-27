class address_trial {
    public static void main(String[] args) {
        int x, y;
        x = 1000;
        y = 1000;
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        y = 10;
        System.out.println("After Changing y to 10: ");
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
    }
}