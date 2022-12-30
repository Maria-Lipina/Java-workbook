package example.OneClassTasks;

public class ProdAndSum {

    /**
     * @param n
     * @return разница между произведением и суммой цифр в числе n.
     */
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        while (n != 0) {
            sum = sum + n % 10;
            prod = prod * (n % 10);
            n /= 10;
        }
        return prod - sum;
    }

}
