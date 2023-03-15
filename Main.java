import example.Fraction;
import example.TwoWayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
//        TwoWayList<Integer> twl = new TwoWayList<>();
////        for (int i = 0; i < 10 ; i++) {
////            twl.pushBack((int)(Math.random()*100));
////        }
////        System.out.println(twl);
////        twl.mergeSort();
////        System.out.println("----");
////        System.out.println(twl);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String [] input = reader.readLine().split(" ");
            Fraction a = new Fraction(
                    Integer.parseInt(input[0]), Integer.parseInt(input[1])
            );
            Fraction b = new Fraction(
                    Integer.parseInt(input[2]), Integer.parseInt(input[3])
            );
            System.out.println(Fraction.sum(a, b));
        } catch (Exception ignored) {
            ignored.printStackTrace();
        }

    }


}