package example;

public class BitShift {

    public void show() {
        int val = 1;
        int t;
        for (int i = 0; i < 8; i++) {
            for (t = 128; t > 0; t = t / 2) {
                if ((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("_" + val);
            val = val << 1;
        }
        System.out.println();
        val = 128;

        for (int i = 0; i < 8; i++) {
            for (t = 128; t > 0; t = t / 2) {
                if ((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("_" + val);
            val = val >> 1;
        }
    }

    /**
     * Показывает целое число в двоичной системе, но не полностью, а только заданное количество битов от младшего разряда к старшему
     * @param val целое число
     * @param numbits количество бит val
     */
    public void showBinaryRight(long val, int numbits) {
        long mask = 1;
        mask <<= numbits - 1; //фактически здесь mask умножается на 2 в степени n-1

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }

}