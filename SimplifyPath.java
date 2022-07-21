import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {
        String path = "/home/foo/.././/java/";
        Deque<String> dir = new ArrayDeque<>();
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case '/':
                    if (path.charAt(i - 1) != '/' & path.charAt(i - 1) != '.') {
                        s.append(path.charAt(i));
                        System.out.println(s);
                        dir.push(s.toString());
                        s.delete(0, s.length());
                        System.out.println("s empty?" + s);
                    }
                    break;
                case '.':
                    if (path.charAt(i - 1) == '.') {
                        System.out.println(dir.toString());
                        dir.removeFirst();
                    }
                    break;
                default:
                    System.out.println(path.charAt(i));
                    s.append(path.charAt(i));
                    break;
            }
        }
        System.out.println("s finally empty?" + s);
        s.append('/');
        while (dir.peek() != null) {
            s.append(dir.removeLast());
        }
        s.deleteCharAt(s.length()-1);
        System.out.println(s);
    }
}
