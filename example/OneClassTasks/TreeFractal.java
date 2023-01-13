package example.OneClassTasks;

public class TreeFractal {

    public static void main(String[] args) {
        long start = System.nanoTime();
//        System.out.println(naive(36)); //9003737871877668864 наносекунд 128600
//        System.out.println(treelike(36)); //9003737871877668864 наносекунд 133300
        long finish = System.nanoTime();
        long elapsed = (finish - start);
        System.out.println("Прошло времени, мс: " + elapsed);
    }

    public static long naive (int n) {
        long r = 1;
        for (int i = 2; i <= n; i++)
            r = r * i;
        return r;
    }

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
        if (start - start == 1)
            return (long)start * end;
        int middle = (start + end) / 2;
        return treelike(start, middle) * treelike(middle + 1, end);
    }

}
