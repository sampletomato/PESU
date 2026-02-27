import java.io.*;
import java.util.*;
public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);
            System.out.println("Contents of the file:");
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        
    }
}