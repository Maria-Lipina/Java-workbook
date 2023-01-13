package example.OneClassTasks;

/**
 * Программа возведения целого числа в степень (stepik)
 */
public class Power {

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
