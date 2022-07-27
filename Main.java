import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {     
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    System.out.println("Min " + minStack.getMin()); //-3
    System.out.println(minStack.pop()); //-3
    System.out.println("Min " + minStack.getMin()); //-3 - неправильно


}

}