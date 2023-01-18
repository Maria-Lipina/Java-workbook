package example;

public class Triangle {

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return целое число, отвечающее на вопрос: могут ли три целых числа, переданные в параметрах, быть сторонами одного треугольника?
     * 0 - не треугольник
     * 1 - треугольник
     * 2 - равнобедренный треугольник
     * 3 - равносторонний треугольник
     */
    public static int isTriangle(int a, int b, int c) {
        if ((a+b<=c) || (a+c<=b) || (b+c<=a)) return 0;
        else if (a==b && b == c) return 3;
        else if ((a==b) && (b!=c) || (a==c) && (b!=c) || (b==c) && (a!=b)) return 2;
        return 1;
    }

    /**
     *
     * @param n целое число
     * @return треугольное число для заданного n
     */
    static int triangleNum (int n) {
        return (n * (n + 1))/2;
    }


    
}