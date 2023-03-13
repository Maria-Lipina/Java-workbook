import example.TwoWayList;

import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TwoWayList<Integer> twl = new TwoWayList<>();
        for (int i = 0; i < 10 ; i++) {
            twl.pushBack((int)(Math.random()*100));
        }
        System.out.println(twl);
        TwoWayList sorted = twl.quickSort();
//        twl.sort();
        System.out.println("----");
        System.out.println(sorted);

        //        twl.selectionSort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(o1, o2);
//            }
//        });
    }
}