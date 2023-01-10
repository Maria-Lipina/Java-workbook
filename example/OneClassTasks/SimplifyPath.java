package example.OneClassTasks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/simplify-path/">...</a>
 *Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.
 *
 * In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.
 *
 * The canonical path should have the following format:
 *
 * The path starts with a single slash '/'.
 * Any two directories are separated by a single slash '/'.
 * The path does not end with a trailing '/'.
 * The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
 * Return the simplified canonical path.
 */
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