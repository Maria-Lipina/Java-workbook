package example;

public class LCM {
    public static int find(int a, int b) {
        return a * b / GCD.findbyEuclid(a, b);
    }

}
