package example.OneClassTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSort {

    /**
     * Просеивание входного массива (кучи) и "вынесение элементов наверх, если они не являются самыми большими" - потому что куча восходящая, сортировка от наименьшего к наибольшему
     * @param array целочисленный массив для сортировки
     * @param heapSize размер кучи
     * @param rootIndex индекс наибольшего элемента
     */
    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; //инициализация наибольшего элемента как корня (или вершины пирамиды)
        int leftChild = 2 * rootIndex + 1; //индексы детей
        int rightChild = 2 * rootIndex + 2;

        //Если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;

        //Если самый большой элемент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
        }

        //Рекурсивно преобразуем в двоичную кучу затронутое поддерево
        heapify(array, heapSize, largest);
    }

    /**
     * Пирамидальная сортировка или сортировка кучей, простая топорная реализация,
     * @param array
     */
    public static void heapSort(int[] array) {
        //Построение кучи (перегруппируем массив)
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);

        //Один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >=0; i--) {
            //Перемещаем текущий корень в конец отсортированного массива
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //Просеиваем уменьшенную кучу
            heapify(array, i, 0);
        }
    }

    /**
     * Упрощенная пирамидальная сортировка через Priority Queue
     * @param array неотсортированный массив целых чисел
     * @return отсортированный массив
     */
    public static List<Integer> heapSortSimplified(List<Integer> array) {
        var pq = new PriorityQueue<Integer>();
        for (int num : array) {
            pq.add(num);
        }
        List<Integer> sortedArray = new ArrayList<>();
        while (!pq.isEmpty()) {
            sortedArray.add(pq.poll());
        }
        return sortedArray;
    }

}
