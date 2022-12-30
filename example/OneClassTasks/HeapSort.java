package example.OneClassTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSort {
    
    public static List<Integer> it(List<Integer> array) {
        var pq = new PriorityQueue<Integer>();
        for (int num : array) {
            pq.add(num);
        }
        List<Integer> sortedArray = new ArrayList<>();
        while (!pq.isEmpty()) {
            sortedArray.add(pq.poll());
        }
    return sortedArray;
    }
}
