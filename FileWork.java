import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWork {
    
    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir");
            System.out.println(path);
            path = path.concat("/wf");
            File dir = new File(path);
            dir.mkdir();
            File f = new File(path + "/f.txt");

            f.createNewFile();

            System.out.println(f.getPath());
            System.out.println(f.getCanonicalPath());

            FileWriter fw = new FileWriter("wf\\f.txt", true);
            fw.write("ready for pony\n");
            fw.write("wait for fallout\n");
            fw.close();

            BufferedReader bfr = new BufferedReader(new FileReader("wf\\f.txt"));
            String s;
            while ((s = bfr.readLine()) != null) {
                System.out.printf("== %s ==\n", s);
            }
            bfr.close();
        
            /*TODO: попробовать записать содержимое файла в коллекцию и наоборот - содержимое коллекции в файл. Например, это мне поможет при реализации задания на бинарный поиск
             */

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
