
import java.util.Stack;

public class Test_Code {
    public static void main(String[] args) {

        Stack<Integer> MyStack = new Stack<>();

        MyStack.push(1);
        MyStack.push(2);
        MyStack.push(3);
        MyStack.push(8);
        MyStack.push(15);

        System.out.println(MyStack.size());

        MyStack.pop();
        System.out.println(MyStack.size());

        MyStack.peek();
        System.out.println(MyStack.size());

        MyStack.pop();
        System.out.println(MyStack.size());
        MyStack.pop();
        System.out.println(MyStack.size());

    }
}
