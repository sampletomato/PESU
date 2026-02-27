import java.util.Scanner;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // Frequency array for ASCII characters
        int[] freq = new int[256];
        // Count characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ')   // ignoring spaces
                freq[ch]++;
        }
        // Display character counts
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " - " + freq[i]);
            }
        }
    }
}