import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class SimplifyPath {

    public static void main(String[] args) {
        String input = "/home/foo/.././/java/";
        String [] path = input.split("/");  //null home foo .. . null java (7)
        Deque <String> canonical = new ArrayDeque<>();
        for (int i = 0; i < path.length; i++) {

            switch (path[i]) {
                case ".": System.out.println(path[i]+ " equals");
                    
                    break;
                case "": System.out.println(path[i]+ "equals empty");
                
                break;

                case "..": System.out.println(path[i]+ " nsr");
                break;
            
                default: System.out.println(path[i] + " normal");
                    break;
            }
        }
        //     if (path[0].equals(path[i]) | ".".equals(path[i])) {
        //         // canonical.offer(path[i]);
        //         // System.out.println(canonical + " добавлен " + path[i]);
        //         System.out.println(path[i]+ " equals");
        //     } else {
        //         if ("..".equals(path[i])) {
        //             // canonical.pop();
        //             // System.out.println(canonical + " убран " + path[i]);
        //             System.out.println(path[i]+ " nsr");
        //         }
        //         System.out.println(path[i] + "not equals not nsr");
        //     }
        // }

        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < path.length; i++) {
        //     if (path[i] != "..") {
        //         sb.append("/" + path[i]);
        //     }
        //     if (path[i] == "..") {
        //         sb.delete(sb.lastIndexOf("/"), sb.length());
        //     }
        // }
    }

            // for (String str : path) {
        //     if (str != "") {
        //         System.out.print(str + " ");
        //     }
        //     else {
        //         System.out.print("null ");
        //     }
        // }
        // System.out.println(path.length);
    
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
