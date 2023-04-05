package example;

import java.util.Set;
import java.util.Stack;

public class PolishNotation {

    /**
     * Вычислить значение арифметического выражения, заданного в польской нотации
     * @param tokens массив строк, каждый элемент которого представляет собой операцию или операнд
     * @return значение выражения
     */
    public static int calc(String[] tokens) {
        Set<String> operations = Set.of("+", "-", "*", "/");
        Stack<Integer> operands = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!operations.contains(tokens[i])) {
                operands.push(Integer.parseInt(tokens[i]));
            } else {
                switch (tokens[i]) {
                    case "+":
                        operands.push(operands.pop() + operands.pop());
                        break;
                    case "-":
                        operands.push(-operands.pop() + operands.pop());
                        break;
                    case "*":
                        operands.push(operands.pop() * operands.pop());
                        break;
                    case "/":
                        int temp = operands.pop();
                        operands.push(operands.pop() / temp);
                        break;
                }
            }
        }
        return operands.peek();
    }

}