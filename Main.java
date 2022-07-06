import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int [6];
        int k = 4;

        FileWriter fw = new FileWriter("test.txt", true);
        fw.append(NumsPermutation.generate(arr, k, 0));
    }
}