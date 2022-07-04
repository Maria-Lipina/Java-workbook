import java.util.Arrays;

public class NumsPermutation {

    public static void generate(int[] arr, int k, int index) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 0; i < k; ++i) {
            arr[index] = i;
            generate(arr, k, index + 1);
        }
    }
}
