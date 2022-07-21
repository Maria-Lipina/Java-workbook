import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] tokens = new String[] { "2", "1", "+", "3", "/" };
        System.out.println(PolishNotation.calc(tokens));
    }
}