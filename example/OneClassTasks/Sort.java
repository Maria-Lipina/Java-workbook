package example.OneClassTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Sort {

    /**
     * Сортировка пузырьком
     * @param array целочисленный массив
     */
    public static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length; i++) {
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }

    /**
     * Сортировка выбором
     * @param array целочисленный массив
     */
    public static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (i != minPosition){
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }


    /**
     * сортировка вставками
     * @param array неотсортированный массив целых чисел
     * @return отсортированный массив
     */
    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * быстрая сортировка
     * @param array целочисленный массив
     */
    public static void quickSort (int[] array) {
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort (int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do {
            while(array[leftPosition] < pivot) {
                leftPosition++;
            }
            while(array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);

        if (leftPosition < endPosition) {
            quickSort(array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition) {
            quickSort(array, startPosition, rightPosition);
        }

    }


    /**
     * сортировка слиянием
     * @param array целочисленный массив
     * @return отсортированный массив
     */
    public static List<Integer> mergeSort(List<Integer> array) {
        if (array.size() == 1) {
            return array;
        }

        int middle = array.size() / 2;
        List<Integer> left = array.subList(0, middle);
        List<Integer> right = array.subList(middle, array.size());
        return merge(mergeSort(left), mergeSort(right));
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
