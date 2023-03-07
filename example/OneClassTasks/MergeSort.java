package example.OneClassTasks;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {


    /**
     * сортировка слиянием, старый метод через коллекции
     * @param array целочисленный массив
     * @return отсортированный массив
     */
    //пояснения в одном из семинаров к Java модулю GB
    public static List<Integer> sort(List<Integer> array) {
        if (array.size() == 1) {
            return array;
        }

        int middle = array.size() / 2;
        List<Integer> left = array.subList(0, middle);
        List<Integer> right = array.subList(middle, array.size());
        return merge(sort(left), sort(right));
    }

    private static List<Integer> merge (List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int indexLeft = 0;
        int indexRight = 0;

        while (indexLeft < left.size() && indexRight < right.size()) {
            if(left.get(indexLeft) < right.get(indexRight)) {
                result.add(left.get(indexLeft));
                indexLeft++;
            } else {
                result.add(right.get(indexRight));
                indexRight++;
            }
        }

        result.addAll(left.subList(indexLeft, left.size()));
        result.addAll(right.subList(indexRight, right.size()));
        return result;
    }

    /**
     * Сортировка слиянием по-новому, без коллекций через буфер
     * @param numbers целочисленный массив
     */

    public static void sort(int[] numbers){
        int[] buffer = new int[numbers.length];
        sort(numbers, 0, numbers.length-1, buffer);
    }

    private static void sort(int[] numbers, int leftIndex, int rightIndex, int[] buffer){
        if(leftIndex == rightIndex) return;
        int middleIndex = (leftIndex + rightIndex) / 2;
        sort(numbers, leftIndex, middleIndex, buffer);
        sort(numbers, middleIndex, rightIndex, buffer);

        middleIndex++;
        int position = leftIndex;
        while(leftIndex <= middleIndex && middleIndex <= rightIndex) {
            if (numbers[leftIndex] < numbers[middleIndex]) {
                buffer[position] = numbers[leftIndex];
                leftIndex++;
            } else {
                buffer[position] = numbers[middleIndex];
                middleIndex++;
            }
        }
        while (leftIndex <= middleIndex) {
            buffer[position] = numbers[leftIndex];
            position++;
            leftIndex++;
        }
        while (middleIndex <= rightIndex) {
            buffer[position] = numbers[rightIndex];
            position++;
            rightIndex++;
        }
        for (int i = leftIndex; leftIndex <= rightIndex; i++) {
            numbers[i] = buffer[i];
        }
    }
}
