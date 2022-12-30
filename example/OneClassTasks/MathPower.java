package example.OneClassTasks;

public class MathPower {

    /**
     * @param a
     * @param b
     * @return возведение числа a в целочисленную степень b.
     */

    public static double mthPower(double a, int b) {
        if (a == 0 & b == 0)
            return Double.NaN;
        if (b == 0)
            return 1;
        if (b < 0)
            return mthPower(1 / a, -b);
        double res = mthPower(a, b / 2);
        if (b % 2 == 0)
            return res * res;
        else
            return res * res * a;
    }

}
//TODO: реализовать пример 5 из текста задачи.