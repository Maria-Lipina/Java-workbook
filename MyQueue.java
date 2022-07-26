import java.util.Stack;

class MyQueue {

    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    private void reverse() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.add(in.pop());
            }
        }
    }

    public int pop() {
        reverse();
        return out.pop();
    }
    
    public int peek() {
        reverse();
        return out.peek();
    }
    
    public boolean empty() {
        reverse();
        return out.empty();
    }
}
