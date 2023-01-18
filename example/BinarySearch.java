package example;

public class BinarySearch {

    public static int recursively(int[] array, int value) {
        return recursively(array, value, 0, array.length - 1);
    }

    private static int recursively(int[] array, int value, int min, int max) { //min, max - это индексы минимального и максимального элемента, а не значения, не путай
        int midpoint;
        if (max < min) return -1;
        else midpoint = (max - min) / 2 + min;

        if (array[midpoint] < value) return recursively(array, value, midpoint + 1, max);
        if (array[midpoint] > value) return recursively(array, value, min, midpoint);
        else return midpoint;
    }

    public static int cycle(int[] array, int value) {
        int left = 0, right = array.length - 1;
        while(right - left > 1) {
            int mid = (left + right) / 2;
            if (array[mid] < value) left = mid;
            else right = mid;
        }
        if (array[left] == value) return left;
        if (array[right] == value) return right;
        return -1;
    }



}

