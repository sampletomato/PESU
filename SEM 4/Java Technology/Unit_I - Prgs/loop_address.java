class loop_address {
    public static void main(String[] args) {
        int i;
        for(i = 1; i < 11; i++)
            System.out.println(i + " -- " + System.identityHashCode(i));
        System.out.println(i instanceof Integer);
    }
}