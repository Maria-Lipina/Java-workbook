import example.ArrayTasks;
import example.TreeFactorial;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = ArrayTasks.compose(sc);
        int [] arr1 = ArrayTasks.compose(sc);

        Instant start = Instant.now();
        System.out.println(ArrayTasks.countPairs(arr, arr1, 100));
        Instant finish = Instant.now();
        System.out.println("Время выполнения:" +
                Duration.between(start, finish).toMillis());
    }

}
