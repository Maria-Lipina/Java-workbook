import java.util.Arrays;
import java.util.List;

public class SimplifyPath {

    public static void main(String[] args) {
        String input = "/home/foo/.././/java/";
        String[] path = input.split("/"); //null home foo .. . null java (7) Короче надо перевернуть тут в LinkedList или другую коллекцию и убрать из нее лишнее, а потом склеить в стрингбилдере
        List <String> l = Arrays.asList(path);

        // for (String str : path) {
        //     if (str != "") {
        //         System.out.print(str + " ");
        //     }
        //     else {
        //         System.out.print("null ");
        //     }
        // }
        // System.out.println(path.length);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.length; i++) {
            if (path[i] != "..") {
                sb.append("/" + path[i]);
            }
            if (path[i] == "..") {
                sb.delete(sb.lastIndexOf("/"), sb.length());
            }
        }
    }

    // Deque<String> dir = new ArrayDeque<>();
    // StringBuilder s = new StringBuilder();
    // for (int i = 1; i < path.length(); i++) {
    //     switch (path.charAt(i)) {
    //         case '/':
    //             if (path.charAt(i - 1) != '/' & path.charAt(i - 1) != '.') {
    //                 s.append(path.charAt(i));
    //                 System.out.println(s);
    //                 dir.push(s.toString());
    //                 s.delete(0, s.length());
    //                 System.out.println("s empty?" + s);
    //             }
    //             break;
    //         case '.':
    //             if (path.charAt(i - 1) == '.') {
    //                 System.out.println(dir.toString());
    //                 dir.removeFirst();
    //             }
    //             break;
    //         default:
    //             System.out.println(path.charAt(i));
    //             s.append(path.charAt(i));
    //             break;
    //     }
    // }
    // System.out.println("s finally empty?" + s);
    // s.append('/');
    // while (dir.peek() != null) {
    //     s.append(dir.removeLast());
    // }
    // s.deleteCharAt(s.length()-1);
    // System.out.println(s);
}
