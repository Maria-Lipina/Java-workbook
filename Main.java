import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new FileReader("wf\\f.txt"));
        String s;
        Random rdm = new Random();
        Queue<Person> persons = new LinkedList<>();

        while ((s = bfr.readLine()) != null) {
            persons.add(new Person(s, rdm.nextInt(20, 50)));
            System.out.println(persons.toString());
            System.out.println("\n-----\n");
        }

        bfr.close();
       
    }
}

// BufferedReader bfr = new BufferedReader(new FileReader("wf\\f.txt"));
// String s;
// Random rdm = new Random();
// Queue<Person> persons = new LinkedList<>();

// while ((s = bfr.readLine()) != null) {
//     persons.add(new Person(s, rdm.nextInt(20, 50)));
//     System.out.println(persons.toString());
//     System.out.println("\n-----\n");
// }

// bfr.close();