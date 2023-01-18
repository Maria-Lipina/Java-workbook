package example;

/**
 * Вывести разложение натурального числа n на простые множители.
 * Простые множители должны быть упорядочены по возрастанию и разделены пробелами.
 * 2≤n≤10^6.
 */
public class PrimeDivisors {

    public static StringBuilder primeDivisors(int n) {
        StringBuilder res = new StringBuilder();
        return primeDivisors(n, res);
    }


    public static StringBuilder primeDivisors(int n, StringBuilder res) {
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                res.append(i);
                res.append(" ");
                n /= i;
                return primeDivisors(n, res);
            }
            i++;
        }
        return res;
    }
}
