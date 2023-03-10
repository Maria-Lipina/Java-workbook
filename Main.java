import example.TwoWayList;

import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TwoWayList<Integer> twl = new TwoWayList<>();
        for (int i = 0; i < 10; i++) {
            twl.add((int)(Math.random()*100));
        }
        twl.print();
        twl.quickSort();
//        twl.sort();
        twl.print();

        //        twl.selectionSort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(o1, o2);
//            }
//        });
    }
}