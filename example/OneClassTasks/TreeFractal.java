package example.OneClassTasks;

import java.util.Scanner;

public class TreeFractal {

    public static long treelike (int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (n == 1 || n == 2)
            return n;
        return treelike(2, n);
    }

    public static long treelike(int start, int end) {
        if (start > end)
            return 1;
        if (start == end)
            return start;
        if (end - start == 1)
            return (long)start * end;
        int middle = (start + end) / 2;
        return treelike(start, middle) * treelike(middle + 1, end);
    }

}
