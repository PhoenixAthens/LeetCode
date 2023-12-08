package LinkedIN_Learning.Java_Algorithms;
import java.util.Stack;
public class StackDS {

    public static void nextGreaterElement_Hodge(int[] arr){
        if(arr.length == 0){
            System.out.println();
            return;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for(int i = 1; i<arr.length;i++){
            int next = arr[i];
            if(!stack.isEmpty()){
                int popped = stack.pop();
                while(popped<next){
                    System.out.println(popped+" --> "+next);
                    if(stack.isEmpty()){
                        break;
                    }
                    popped = stack.pop();
                }
                if(popped>next){
                    stack.push(popped);
                }
            }
            stack.push(next);
        }
    }
    public static void nextGreaterElement(int[] arr){
        if(arr.length==0){
            return;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            int popped = stack.pop();
            int next = arr[i];
            while(popped<next){
                System.out.println(popped+" --> "+next);
                if(!stack.isEmpty())popped = stack.pop();
                else break;
            }
            if(popped>=next)stack.push(popped);
            stack.push(next);

        }
        while(!stack.isEmpty())System.out.println(stack.pop()+" --> "+-1);
    }
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
        nextGreaterElement(new int[]{16,7,2,15});
        /*
        * 2  --> 15
        * 7  --> 15
        * 15 --> -1
        * 16 --> -1
        */
        // Test case 1: Normal case, elements increasing
        System.out.println("Test case 1:");
        nextGreaterElement(new int[]{1, 2, 3, 4, 5});
        // Test case 2: Normal case, elements decreasing
        System.out.println("Test case 2:");
        nextGreaterElement(new int[]{5, 4, 3, 2, 1});
        // Test case 3: Normal case, elements random
        System.out.println("Test case 3:");
        nextGreaterElement(new int[]{3, 4, 2, 7, 1, 5});
        // Test case 4: Edge case, empty array
        System.out.println("Test case 4:");
        nextGreaterElement(new int[]{});
        // Test case 5: Normal case, same elements
        System.out.println("Test case 5:");
        nextGreaterElement(new int[]{3, 3, 3, 3});
        // Test case 6: Normal case, single element
        System.out.println("Test case 6:");
        nextGreaterElement(new int[]{2});
    }

}
