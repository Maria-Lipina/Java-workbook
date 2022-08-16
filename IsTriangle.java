public class IsTriangle {

    /* 0 - не треугольник
     * 1 - треугольник
     * 2 - равнобедренный треугольник
     * 3 - равносторонний треугольник
     */
    public static int define(int a, int b, int c) {
        if ((a+b<=c) || (a+c<=b) || (b+c<=a)) return 0;
        else if (a==b && b == c) return 3;
        else if ((a==b) && (b!=c) || (a==c) && (b!=c) || (b==c) && (a!=b)) return 2;
        return 1;
    }
    
}