class Addition {
    public int add(int a, int b) {return a + b;}
    public int add(int a, int b, int c) {return a + b + c;}
    public int add(int[] a) {
        int s = 0;
        for(int i: a) s += i;
        return s;
    }
    public float add(float a, float b) {return a + b;}
    public float add(float a, float b, float c) {return a + b + c;}
    public float add(float[] a) {
        float s = 0;
        for(float i: a) s += i;
        return s;
    }

}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(1, 2));
        System.out.println(a.add(1, 2, 3));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(a.add(arr));
        System.out.println(a.add(1.0f, 2.0f));
        System.out.println(a.add(1.0f, 2.0f, 3.0f));
        float[] farr = {1.5f, 2.5f, 3.5f, 4.5f};
        System.out.println(a.add(farr));
    }
}
