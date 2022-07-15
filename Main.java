import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        DuplicateZeroes.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}