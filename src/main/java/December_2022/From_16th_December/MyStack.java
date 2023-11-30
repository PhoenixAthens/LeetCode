package December_2022.From_16th_December;
import java.util.ArrayDeque;
//ImplementStackFromQueue
public class MyStack {
    //Runtime: 0ms beats 100%, Memory: 40.2MB beats 86.5%
    private  ArrayDeque<Integer> deque;
    public MyStack() {
        deque=new ArrayDeque<>();
    }

    public void push(int x) {
        deque.push(x);
    }

    public int pop() {
        return deque.pop();
    }

    public int top() {
        return deque.peek();
    }

    public boolean empty() {
        return deque.isEmpty();
    }
    public static void main(String...args){
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(5);
        deque.addFirst(6);
        deque.addFirst(7);
        System.out.println(deque);
    }
}
