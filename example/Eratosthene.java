package example;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class Eratosthene {
    /**
     *Поиск всех простых чисел от 1 до n c помощью решета Эратосфена
     * @param n
     */
    public static LinkedList<Integer> sieve(int n) {
        boolean[] sieve = new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            sieve[i] = true;
        }
        sieve[0] = sieve[1] = false;
        LinkedList<Integer> primes = new LinkedList<>();
        for (int i = 2; i < sieve.length; i++) {
            if(sieve[i]) {
                primes.add(i);
                for (int j = 2; j*i <= n ; j++) sieve[j*i] = false;
                }
            }
        return primes;
    }
}
