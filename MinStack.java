import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;

/*Ссылка на задачу https://leetcode.com/problems/min-stack/ */

public class MinStack {
    LinkedList <Integer> ordered = new LinkedList<>();
    Stack<Integer> in;
    Comparator<Integer> c = Comparator.naturalOrder();

    public MinStack() {
        in = new Stack<>();
    }
    
    public void push(int val) {
        in.push(val);
    }
    
    public int pop() {//для литкода нужно снова изменить на void
        return in.pop();
    }
    
    private void sort(Stack<Integer> in) {
        ordered.addAll(in);
        c.compare(ordered.get(0), ordered.get(1));
        ordered.sort(c);
    }

    public int top() {
        sort(in);
        return ordered.peekLast();
    }
    
    public int getMin() {
        sort(in);
        return ordered.peekFirst();
    }
}
