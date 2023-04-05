package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * генерации перестановок чисел
 */
public class NumsPermutation {

    /**
     * Сгенерировать все комбинации длины N из K чисел с повторениями. Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"
     * @param arr массив длины N, в который записывается результат генерации
     * @param k количество чисел в компинации от 0 до К, е включая К
     * @param ind индекс массива arr, с которого начинается заполнение комбинациями чисел
     */
    public void withRepeat(int[] arr, int k, int ind) {
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

    /**
     * Сгенерировать все комбинации из N чисел длины K без повторений. Пример для N=4 и K=2 <br>
     * <s>11 21 31</s><br>
     * 12 <s>22 32</s><br>
     * 13 23 <s>33</s><br>
     * 14 24 34 <s>44</s><br>
     * @param n сколько чисел от 1 до N участвуют в комбинации
     * @param k длина комбинации
     * @return List комбинаций, каждая из которых представляет собой List чисел в ней
     */
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
