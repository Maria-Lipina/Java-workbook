import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {     
        Random r = new Random();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            array.add(r.nextInt(20));
        }    
        System.out.println(array);
        System.out.println(MergeSort.mergeSort(array));
}

}