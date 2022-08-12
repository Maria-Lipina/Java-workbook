import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class hello_collections {
    
    public static void main(String[] args) throws IOException {
      addToJournal("wf\\f.txt", "wf\\fi.txt");
      addToJournal("wf\\f1.txt", "wf\\fi.txt");
    }

    public static void addToJournal(String input, String journal) throws IOException{
      BufferedReader bfr = new BufferedReader(new FileReader(input));
      Map<Integer, String> people = new HashMap<>();
      int key = journalSize(journal);

      String s;
      while ((s = bfr.readLine()) != null) {
         ++key;
         people.put(key, s);
      }
      bfr.close();

      FileWriter fw = new FileWriter(journal, true);
      for (Integer i : people.keySet()) {
      fw.append(i + " " + people.get(i) + "\n");
      }
      fw.flush();
      fw.close();

   }

   public static int journalSize(String journal) throws IOException {

      BufferedReader bfr = new BufferedReader(new FileReader(journal));
      int linecount = 0;
      while (bfr.readLine() != null) {
         linecount++;
      }
      bfr.close();
      return linecount;
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