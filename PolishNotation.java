import java.util.Stack;

public class PolishNotation {

    public static void main(String[] args) {
        String[] tokens = new String[] { "2", "1", "+", "3", "/" };
        Stack<Integer> opnds = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            try {
                opnds.push(Integer.parseInt(tokens[i]));
            } catch (NumberFormatException nfe) {
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
                    default:
                        System.out.println(nfe.getMessage());
                        break;
                }
            }
        }
        System.out.println(opnds.peek());
    }

}