public class ArraysDemo {
    public static void main(String[] args) {
        double[] arr = new double[5];
        long[] fArr = new long[5];
        char[] cArr = new char[5];
        String[] sArr = new String[5];
        Integer[] newArr = new Integer[5];
        for(int i = 0; i < arr.length; i++){
            System.out.println("double array item: " + arr[i]);
            System.out.println("long array item: " + fArr[i]);
            System.out.println("char array item: " + cArr[i]);
            System.out.println("String array item: " + sArr[i]);
            System.out.println("Integer Wrapper array item: " + newArr[i]);
            System.out.println("____________");
        }
    }    
}
