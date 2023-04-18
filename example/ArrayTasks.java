package example;

public class ArrayTasks {

    /**
     * <a href="https://leetcode.com/problems/build-array-from-permutation/">текст задачи</a>
     * @param nums целочисленный массив
     * @return массив, составленный из элементов nums по формуле ans[i] =
     *         nums[nums[i]]. nums[i] < nums.length.
     */
    public static int[] permutate(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    /**
     * Дан массив целых чисел A[0..n). Не используя других массивов переставить элементы массива A в обратном порядке за O(n).
     *
     * n ≤ 10000
     * @param arr массив целых чисел
     * @param diff дельта - значение, на которое элементы массива должны отличаться
     * @return индекс элемента, который больше или меньше предыдущего на величину, переданную в diff
     */
    public static int findDiffIndex(int[] arr, int diff) {
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i-1]) >= diff) return i;
        }
        return -1;
    }

    public static void reverse(int[] arr) {
        int temp = 0;
        int i = 0;
        int j = arr.length-1;
        while (i < arr.length / 2) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    /**
     * Даны два строго возрастающих массива целых чисел A[0..n], B[0..m] и число k.
     * Найти количество таких пар индексов (i, j), что A[i] + B[j] = k при обходе массива B от конца к началу. Время работы O(n + m).
     */
    public static int indexPairsCount(int[] a, int[] b, int k) {
        int result = 0;
        int i = 0;
        int j = b.length-1;
        while (i < a.length && j > 0) {
            if (a[i] + b[j] == k) result++;
            i++; j--;
        }
        return result;
    }

}
