package example;

public class BinarySearch {

    public int recursively(int[] array, int value) {
        return recursively(array, value, 0, array.length - 1);
    }

    private int recursively(int[] array, int value, int min, int max) {
        int midpoint;
        if (max < min) return -1;
        else midpoint = (max - min) / 2 + min;

        if (array[midpoint] < value) return recursively(array, value, midpoint + 1, max);
        if (array[midpoint] > value) return recursively(array, value, min, midpoint);
        else return midpoint;
    }

    public int cycle(int[] array, int value) {
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

    private int lowerBound;

    public int extended(int[] array, int value, boolean bound) {
        if (bound) {
            lowerBound = 0;
            int upperBound = array.length;
            while (lowerBound < upperBound) {
                int mid = (lowerBound + upperBound) / 2;
                if (!(value < array[mid])) lowerBound = mid + 1;
                else upperBound = mid;
            }
        } else extended(array, value);
        return lowerBound;
    }

    public int extended(int[] array, int value) {
        lowerBound = 0;
        int upperBound = array.length;
        while (lowerBound < upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            if (array[mid] < value) lowerBound = mid + 1;
            else upperBound = mid;
        }
        return (lowerBound == array.length || array[lowerBound] != value) ? -1 : lowerBound;
    }

}

