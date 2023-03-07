package example.OneClassTasks;

public class BinarySearch {

    public static int search(int[] array, int value) {
        return search(array, value, 0, array.length-1);
    }

    private static int search(int[] array, int value, int min, int max) { //min, max - это индексы минимального и максимального элемента, а не значения, не путай
        int midpoint;
        if (max < min) return -1;
        else midpoint = (max - min) / 2 + min;

        if (array[midpoint] < value) return search(array, value, midpoint +1, max);
        if (array[midpoint] > value) return search(array, value, min, midpoint);
        else return midpoint;
    }
}
