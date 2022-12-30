package example.OneClassTasks;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeroes {

    public static void duplicateZeros(int[] arr) { //https://leetcode.com/problems/duplicate-zeros/discuss/2283862/Java-oror-time-O(N)-oror-space-O(N)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                queue.offer(arr[i]);
                queue.offer(arr[i]);
            } else {
                queue.offer(arr[i]);
            }
            arr[i] = queue.poll();
        }
    }
}
