class Addition {
    public int add(int a, int b) {return a + b;}
    // public float add(int c, int d) {return 0.0f;} // Invalid because 2 methods both accept 2 ints
    public float add(int a, float b) {return (float) a + b;}
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(10, 20));
        System.out.println(a.add(10, 20.0f));
    }
}
