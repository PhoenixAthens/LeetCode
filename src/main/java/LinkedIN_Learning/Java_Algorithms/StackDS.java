package LinkedIN_Learning.Java_Algorithms;
import java.util.Stack;
public class StackDS {
    public static void main(String...args){
        Stack<String> callStack = new Stack<>();
        System.out.println("START main");
        callStack.push("main");
        System.out.println("START builder");
        callStack.push("builder");
        System.out.println("START external-service");
        callStack.push("external-service");
        System.out.println("END: "+callStack.pop());
        System.out.println("START parse-external-data");
        callStack.push("parse-external-data");
        System.out.println("END: "+callStack.pop());
        System.out.println("END: "+callStack.pop());
        System.out.println("END: "+callStack.pop());
    }
}
