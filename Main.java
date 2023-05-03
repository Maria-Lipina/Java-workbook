import example.ArrayTasks;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30};
        int [] arr1 = {9, 15, 35};
        System.out.println(Arrays.toString(ArrayTasks.deleteElement(arr, 1)));


//        Instant start = Instant.now();
//        Instant finish = Instant.now();
//        System.out.println("Время выполнения:" +
//                Duration.between(start, finish).toMillis());
    }

}
