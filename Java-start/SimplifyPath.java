import java.util.ArrayDeque;
import java.util.Deque;

class SimplifyPath {

    public static String solution(String path) {
        String[] pathArr = path.split("/");
        Deque<String> canonical = new ArrayDeque<>();
        for (int i = 1; i < pathArr.length; i++) {

            switch (pathArr[i]) {
                case ".":
                    break;
                case "":
                    break;
                case "..":
                    if (!canonical.isEmpty()) {
                        canonical.removeLast();
                        break;
                    } else {
                        break;
                    }
                default:
                    canonical.addLast(pathArr[i]);
                    break;
            }
        }

        StringBuilder res = new StringBuilder();
        if (canonical.isEmpty()) {
            res.append("/");
        } else {
            for (String string : canonical) {
                res.append("/" + string);
            }
        }
        return res.toString();
}
}

/*Leetcode Submission
 * Runtime: 5 ms, faster than 90.01% of Java online submissions for Simplify Path.
Memory Usage: 42.2 MB, less than 95.75% of Java online submissions for Simplify Path.
 */