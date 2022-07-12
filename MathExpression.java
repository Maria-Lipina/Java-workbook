import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MathExpression {
    public void restore() {
        // должны вызываться другие методы в этом классе и собираться решение
    }

    static char[] textGlobal;
    static List<Integer> signIndexesGlobal;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> signIndexes = new ArrayList<>();
        String text = "5? + 3? = ??";
        char[] textChar = text.replace(" ", "").toCharArray();

        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '+' || textChar[i] == '=') {
                textChar[i] = '_';
            }
            if (textChar[i] == '?') {
                signIndexes.add(i);
            }
        }
        textGlobal = textChar;
        signIndexesGlobal = signIndexes;

        CombWithRep(new int[signIndexes.size()], 0, 10); //потому что К - перебираем только цифры от 0 до 10
    }

    public static void CombWithRep(int[] comb, int index, int K) {
        if (index == comb.length) {
            //готова очередная комбинация
            // давайте здесь поставим на место вопросов очередную комбинацию и проверим, подходит ли она нам
            checkComb(comb);
            return;
        }

        for (int i = 0; i < K; i++) {
            comb[index] = i;
            CombWithRep(comb, index + 1, K);
        }
    }

    public static void checkComb(int[] comb) {
        for (int i = 0; i < comb.length; i++) {

            textGlobal[signIndexesGlobal.get(i)] = Character.forDigit(comb[i], 10);
        }
        
        String[] numbers = String.valueOf(textGlobal).split("_");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a + b == c) {
            System.out.printf("%d + %d = %d\n", a, b, c);
        }
        
    }
}
