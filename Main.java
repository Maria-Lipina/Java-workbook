import example.ArrayTasks;
import example.BinarySearch;
import example.BitShift;
import example.TreeFactorial;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = {0, 2, 4, 5, 5, 5, 5, 6, 7, 9, 11, 13};

        System.out.println(new BinarySearch().extended(arr, 5));
        System.out.println("---");
        System.out.println(new BinarySearch().extended(arr, 5, false));
        System.out.println("---");
        System.out.println(new BinarySearch().extended(arr, 5, true));

//        Instant start = Instant.now();
//        Instant finish = Instant.now();
//        System.out.println("Время выполнения:" +
//                Duration.between(start, finish).toMillis());
    }

}
