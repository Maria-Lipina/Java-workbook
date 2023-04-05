package example;

public class GCD {

    /**
     * Алгоритм Эвклида
     * @param n int
     * @param m int
     * @return int наибольший общий делитель n, m
     */
    public static int findbyEuclid(int n, int m) {
        while (n != 0 && m != 0) {
            if (n >= m) n = n % m;
            else m = m % n;
        }
        return n + m;
    }

}
