import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class hello_collections {
    
    public static void main(String[] args) throws IOException {
       BufferedReader bfr = new BufferedReader(new FileReader("wf\\f.txt"));
       Map<Integer, String> people = new HashMap<>();
       int key = 1;

       String s;
       while ((s = bfr.readLine()) != null) {
       people.put(key, s);
       key++;
       }
       bfr.close();

    //    System.out.println(people.toString());

       FileWriter fw = new FileWriter("wf\\fi.txt", true);
       System.out.println(people.keySet());
       Set<Integer> temp = people.keySet();
       for (Integer i : temp) {
        fw.append(i + " " + people.get(i) + "\n");
       }
       fw.flush();
       fw.close();

    }
}


// BufferedReader bfr = new BufferedReader(new FileReader("wf\\f.txt"));
// List<String> names = new ArrayList<>();

// String s;
// while ((s = bfr.readLine()) != null) {
//     names.add(s);
// }
// bfr.close();

// Queue<Integer> llq = new LinkedList<>();

// Iterator<String> nam = names.iterator();
// while (nam.hasNext()) {
//     llq.offer(nam.next().length());
// }

// List<String> namesShort = new ArrayList<>();

// String temp;
// Iterator<Integer> llqit = llq.iterator();        
// while (llqit.hasNext() && nam.hasNext()) {

//     temp = nam.next() + llqit.next().toString();
//     namesShort.add(temp);
// }

// for (String string : namesShort) {
//     System.out.print(string + "\t");
// }