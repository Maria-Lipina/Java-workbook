package example.OneClassTasks;

public class RLE {
    public static String compress(String data) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        char t = data.charAt(0);
        for (int i = 0; i < data.length(); i++) {
            if (t != data.charAt(i)) {
                sb.append(t);
                if (counter != 1) {
                    sb.append(counter);
                }
                t = data.charAt(i);
                counter = 0;
            }
            counter++;
        }
        sb.append(String.format("%s%d", t, counter));
        return sb.toString();
    }
}
/*TODO: для лучшего сравнения с python и было-стало сюда было бы неплохо добавить метод декомпрессии*/
