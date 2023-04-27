package example;

import java.util.Arrays;
import java.util.Scanner;

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
     * <br>Адаптировала решение <a href="https://github.com/OlegSchwann/Technopark-algorithms/blob/master/1-%D0%B9%20%D0%BC%D0%BE%D0%B4%D1%83%D0%BB%D1%8C/1%20%D0%B7%D0%B0%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5%203%20%D0%B2%D0%B0%D1%80%D0%B8%D0%B0%D0%BD%D1%82/main.cpp">по ссылке</a>
     */
    public static int countPairs(int[] a, int[] b, int k) {
        int result = 0;
        for (int i = 0, j = b.length-1; i < a.length && j > -1;) {
            int sum = a[i] + b[j];
            if (sum > k) j--;
            if (sum < k) i++;
            if (sum == k) {
                result++;
                i++; j--;
            }
        }
        return result;
    }

    public static int[] compose(Scanner arrLength){
        int[] result = new int[arrLength.nextInt()];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    /**
     * Удаление из массива всех элементов, равных указанному.
     * @param arr массив
     * @param n элемент, который нужно удалить.
     * @return копию массива arr без элементов, равных n. Вот она разница между С++ и Java. в С++ для этого есть динамический вектор с поддержкой индексов. Здесь такого нет. Здесь если только связным списком или копированием
     */
    public static int[] deleteElement(int[] arr, int n) {
        int check = 0;
        int pos = 0;
        while(check < arr.length) {
            if (arr[check] != n) {
                arr[pos] = arr[check];
                pos++;
            }
            check++;
        }
        return Arrays.copyOfRange(arr, 0, pos);
    }
}
