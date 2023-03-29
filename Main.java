import example.NumberSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String num = "E8F.2D";
        String num1 = "E8F";
        System.out.println(Arrays.toString(findNumberSystemAndDot(num1)));
        System.out.println(toDecNumber(num1));

    }

    public static double toDecNumber (String N) {

        int[] base = findNumberSystemAndDot(N);
        double decNum = 0;
        int i = N.length() - base[1];
        do { // тут порядок, осталось разобраться, в чем проблема вычислений за точкой https://programforyou.ru/calculators/number-systems
            //На примере скажем 0.2D
            System.out.printf("%f+ ", decNum);
            int pow = (int) Math.pow(base[0], N.length() - i);
            System.out.printf("%d * ", pow);
            int dig = N.charAt(i-1) - '0';
            System.out.printf("%d = ", dig);
            if (dig > 9) dig = 10 + N.charAt(i - 1) - 'A';
            decNum += dig * pow;
            System.out.printf("%f%n", decNum);
            i -= 1;
        } while (i > 0);

        if (base[1] > 0) {
            int start = base[1];
            for (int j = start+1; j < N.length(); j++) {
                double pow = Math.pow(base[0], -(j - start));
                int dig = N.charAt(j) - '0';
                if (dig > 9) dig = 10 + N.charAt(j) - 'A';
                decNum += dig * pow;
            }
        }
        if (base[1] > 0) {

        }

        return decNum;
    }

    static int[] findNumberSystemAndDot(String N) {

        int [] base = {0, 0};

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
