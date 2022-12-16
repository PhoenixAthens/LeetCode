package From_16th_December;
import java.util.Stack;
//ImplementingQueueFromStack
//Runtime:0ms beats 100%, Memory:40.1MB beats 8.54%
public class MyQueue {
    private Stack<Integer> myStack;
    public MyQueue() {
        myStack=new Stack<>();
    }

    public void push(int x) {
        myStack.push(x);
    }

    public int pop() {
        return myStack.remove(0);
    }

    public int peek() {
        return myStack.get(0);
    }

    public boolean empty() {
        return myStack.isEmpty();
    }
}
