package example;

import java.util.Scanner;

public class NumberSystem {

    /**
     * решение задачи:
     *
     * Известно, что все современные компьютеры используют двоичную систему счисления. Но некоторые исследователи считают, что компьютеры на троичной, четверичной и других системах счисления будут работать быстрее.
     *
     * Вычислительная компания XYZ закупила новые экспериментальные компьютеры, но её сотрудники не знают, в какой системе счисления новые компьютеры выдают результаты их вычислений. Помогите им определить их результаты в традиционной десятичной системе, если известно, что последовательность цифр N, которую выдает экспериментальный компьютер, записана в минимально возможной для этого системе счисления.
     * В единственной строке записано исходное число N: 1 ≤ N ≤ 1000000
     * @param N строка-набор цифр в некой системе счисления
     * @return значение N в десятичной системе счисления
     */
    public static double toDecNumber (String N) {

        int[] base = findNumberSystemAndDot(N);
        double decNum = 0;
        int i = base[1];

        do {
            int pow = (int) Math.pow(base[0], base[1] - i);
            int dig = N.charAt(i-1) - '0';
            if (dig > 9) dig = 10 + N.charAt(i - 1) - 'A';
            decNum += dig * pow;
            i -= 1;
        } while (i > 0);

        if (base[1] < N.length()) {
            int start = base[1];
            for (int j = start+1; j < N.length(); j++) {
                double pow = Math.pow(base[0], -(j - start));
                int dig = N.charAt(j) - '0';
                if (dig > 9) dig = 10 + N.charAt(j) - 'A';
                decNum += dig * pow;
            }
        }
        return decNum;
    }

    static int[] findNumberSystemAndDot(String N) {

        int [] base = {0, N.length()};

        for (int i = 0; i < N.length(); i++) {
            int digit = N.charAt(i) - '0';
            if (digit != -2) {
                if (digit > 9) {
                    digit = 10 + (N.charAt(i) - 'A');
                }
                if (base[0] < digit) base[0] = digit;
            } else {
                base[1] = i;
            }
        }
        base[0] += 1;
        return base;
    }
}
