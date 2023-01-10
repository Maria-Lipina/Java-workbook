package example.OneClassTasks;

/**
 * Программа возведения целого числа в степень
 */
public class Power {

    public static void main(String[] args) {

        int a = 7;
        int b = 11;

        System.out.println(Power.bitwise(a, b));

    }

    public static Long bitwise(int num, int power) {
        long res = 1L;
        long powered = num;
        while (power > 0) {
            if ((power & 1) == 1) res*=powered;
            powered *=powered;
            power = power >> 1;
        }
        return res;
    }
}
