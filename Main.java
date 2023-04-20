import example.ArrayTasks;
import example.BitShift;
import example.TreeFactorial;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        new BitShift().showBinaryRight(237658768, 24);
        new BitShift().show();

//        Instant start = Instant.now();
//        Instant finish = Instant.now();
//        System.out.println("Время выполнения:" +
//                Duration.between(start, finish).toMillis());
    }

}
