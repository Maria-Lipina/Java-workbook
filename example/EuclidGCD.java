package example;

public class EuclidGCD {

    /**
     * Алгоритм Эвклида
     * @param n int
     * @param m int
     * @return int наибольший общий делитель n, m
     */
    public static int find(int n, int m) {
        while (n != 0 && m != 0) {
            if (n >= m) n = n % m;
            else m = m % n;
        }
        return n + m;
    }

    public static int find1(int num1, int num2) {
        int modulo = 1;
        while (num2 != 0) {
            modulo = num1 % num2;
            System.out.printf("gcd %d = num1 %d остаток num2 %d%n", modulo, num1, num2);
            num1 = num2;
            num2 = modulo;
            System.out.println("----");
        }
        return num1;
    }
}
