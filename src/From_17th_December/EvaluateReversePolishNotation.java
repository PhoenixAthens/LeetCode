package From_17th_December;
import java.util.*;
public class EvaluateReversePolishNotation {
    //Runtime: 16ms beats 43.83%, Memory: 44.8MB beats 12.67%
    public static int evalRPN(String[] tokens) {
        ArrayDeque<String> list=new ArrayDeque<>();//ArrayDeque is faster than Stack
        for(int i=0;i<tokens.length;i++){//with stack the runtime is 19ms 3ms slower than ArrayDeque
            if(tokens[i].equals("+")){
                int num1=Integer.parseInt(list.pop());
                int num2=Integer.parseInt(list.pop());
                int result=num1+num2;
                list.push(String.valueOf(result));
            }else if(tokens[i].equals("-")){
                int num1=Integer.parseInt(list.pop());
                int num2=Integer.parseInt(list.pop());
                int result=num2-num1;
                list.push(String.valueOf(result));
            }else if(tokens[i].equals("*")){
                int num1=Integer.parseInt(list.pop());
                int num2=Integer.parseInt(list.pop());
                int result=num1*num2;
                list.push(String.valueOf(result));
            }else if(tokens[i].equals("/")) {
                int num1 = Integer.parseInt(list.pop());
                int num2 = Integer.parseInt(list.pop());
                int result = num2 / num1;
                list.push(String.valueOf(result));
            }
            else{
                list.push(tokens[i]);
            }
        }
        return Integer.parseInt(list.pop());
    }
    public static void main(String...args){
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));

    }
}
