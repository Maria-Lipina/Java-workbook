import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class hello_collections {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("wf\\f.txt"));
        List<String> names = new ArrayList<>();

        String s;
        while ((s = bfr.readLine()) != null) {
            names.add(s);
        }
        bfr.close();
        
        Queue<Integer> llq = new LinkedList<>();

        Iterator<String> nam = names.iterator();
        while (nam.hasNext()) {
            llq.offer(nam.next().length());
        }

        List<String> namesShort = new ArrayList<>();

        String temp;
        Iterator<Integer> llqit = llq.iterator();        
        while (llqit.hasNext() && nam.hasNext()) {

            temp = nam.next() + llqit.next().toString();
            namesShort.add(temp);
        }

        for (String string : namesShort) {
            System.out.print(string + "\t");
        }
    }
}
