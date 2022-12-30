package example.OneClassTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumsPermutation {

    public static void withRepeat(int[] arr, int k, int ind) {
        if (ind == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 0; i < k; ++i) {
            arr[ind] = i;
            withRepeat(arr, k, ind + 1);
        }
    }

    List<Integer> comb = new ArrayList<>();
    List<List<Integer>> allCombs = new ArrayList<>(); 

    public List<List<Integer>> withoutRepeat(int n, int k) {
        combine(n, k, 0, 1);
        return allCombs;
    }

    private void combine(int n, int k, int index, int number) { 
        if (index==k) {
            allCombs.add(new ArrayList<>(comb));
            return;
        }
    
        if (number > n) {
            return;
        }
    
        for (int i = number; i <= n; i++) {
            comb.add(i);
            combine(n, k, index + 1, i + 1);
            comb.remove(comb.size() - 1);
        }
    }

}
