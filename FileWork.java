import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWork {

    public static void main(String[] args) {
        try {
            BufferedReader bfr = new BufferedReader(new FileReader("wf\\f.txt"));
            List<String> names = new ArrayList();

            String s;
            while ((s = bfr.readLine()) != null) {
                names.add(s);
            }
            bfr.close();
            System.out.println(names);

            FileWriter fw = new FileWriter("wf\\fi.txt", true);
            for (String name : names) {
                fw.write(name + "\n");
            }
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
/*TODO: Следующих шагов может быть несколько: 
1) пробросить эти двадцать имен в HashMap или в HashTable
2) написать алгоритм бинарного поиска как в начале "Грокаем алгоритмы*/