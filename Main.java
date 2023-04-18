import example.ArrayTasks;
import example.TreeFactorial;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int [] arr = {-5, 0, 3, 18};
        int [] arr1 = {-10, -2, 4, 7, 12};

        System.out.println(ArrayTasks.indexPairsCount(arr, arr1, 7));
//        System.out.println(
//                ArrayTasks.indexPairsCount(composeArray(sc), composeArray(sc), sc.nextInt()
//                ));



//        Instant start = Instant.now();
//        Thread.sleep(10);
//        Instant finish = Instant.now();
//        System.out.println("Время выполнения:" +
//                Duration.between(start, finish).toMillis());
    }

    static int[] composeArray(Scanner sc){
        int[] result = new int[sc.nextInt()];
        for (int i = 0; i < result.length; i++) {
            result[i] = sc.nextInt();
        }
        return result;
    }

}
