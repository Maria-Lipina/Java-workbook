import example.Eratosthene;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> l = Eratosthene.sieve(125);
        l.forEach(n -> System.out.printf("%d ", n));
    }


}