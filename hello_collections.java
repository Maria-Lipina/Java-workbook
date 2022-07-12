import java.util.ArrayList;
import java.util.Random;

public class hello_collections {
    
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        Random gen = new Random();

        System.out.println(al1.size());

        for (int i = 0; i < 10; i++) {
            al1.add(gen.nextInt(30));
        }
        System.out.println(al1);
        System.out.printf("%d / %d / %d / %d\n", al1.get(5), al1.indexOf(5), al1.lastIndexOf(10), al1.remove(9));
        al1.set(0, 456);
        System.out.println(al1);
        System.out.println(Integer.compare(al1.get(3), al1.get(4)));
    
    }
}
