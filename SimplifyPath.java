import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {
        String path = "/home/foo/.././/java/";
        Deque<StringBuilder> dir = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case '/':
                    if (path.charAt(i - 1) != '/' & path.charAt(i - 1) != '.') {
                        res.append(path.charAt(i));
                        dir.push(res);
                        res.delete(0, res.length()-1);
                    }
                    break;
                case '.':
                    if (path.charAt(i - 1) == '.') {
                        dir.pop();
                    }
                    break;
                default:
                    res.append(path.charAt(i));
                    break;
            }
        }
        for (StringBuilder stringBuilder : dir) {
            res.append(dir.getFirst());
        }
        System.out.println(res);
    }

    // до ближайшего слэша - стрингбилдер
    // один слэш - в стрингбилдер и декью, если стрингбилдер не пуст и не содержит
    // только другой слэш
    // точка - предыдущий сивол - точка? Да - пропускаю. Нет - убираю из дэкью
    // последний элемент (имя+/)
    // в конце добавляю в стрингбилдер элементы очереди, начиная с первого
}
