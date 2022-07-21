import java.util.Set;
import java.util.Stack;

public class PolishNotation {

    public static int calc(String[] tokens) {
        Set<String> ops = Set.of("+", "-", "*", "/");
        Stack<Integer> opnds = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!ops.contains(tokens[i])) {
                opnds.push(Integer.parseInt(tokens[i]));
            } else {
                switch (tokens[i]) {
                    case "+":
                        opnds.push(opnds.pop() + opnds.pop());
                        break;
                    case "-":
                        opnds.push(-opnds.pop() + opnds.pop());
                        break;
                    case "*":
                        opnds.push(opnds.pop() * opnds.pop());
                        break;
                    case "/":
                        int temp = opnds.pop();
                        opnds.push(opnds.pop() / temp);
                        break;
                }
            }
        }
        return opnds.peek();
    }

}