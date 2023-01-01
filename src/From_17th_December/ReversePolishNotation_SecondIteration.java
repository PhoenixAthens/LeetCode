package From_17th_December;

import java.util.ArrayDeque;

public class ReversePolishNotation_SecondIteration {
    public static void main(String...args){
        int num=9;
        System.out.println("+".hashCode());
        System.out.println("-".hashCode());
        System.out.println("*".hashCode());
        System.out.println("/".hashCode());

    }
    public static int evalRPN(String[] tokens) {
        //First iteration
        //Runtime: 9 ms beats 76.51%, Memory: 45.6 MB beats 6.25%
        //Second Iteration
        //Runtime: 6 ms beats 89.26%, Memory: 42.1 MB beats 86.13%
        //Third Iteration
        //Runtime: 9 ms beats 76.51%, Memory: 45 MB beats 9.49%
        int len= tokens.length;
        if(len==1){
            return Integer.parseInt(tokens[0]);
        }else{
            ArrayDeque<String> list=new ArrayDeque<>();
            int total=0;
            for(int i=0;i<tokens.length;i++){
                if(tokens[i].hashCode()==43){
                    int num1=Integer.parseInt(list.pop());
                    int num2=Integer.parseInt(list.pop());
                    int result=num1+num2;
                    total=result;
                    list.push(String.valueOf(result));
                }else if(tokens[i].hashCode()==45){
                    int num1=Integer.parseInt(list.pop());
                    int num2=Integer.parseInt(list.pop());
                    int result=num2-num1;
                    total=result;
                    list.push(String.valueOf(result));
                }else if(tokens[i].hashCode()==42){
                    int num1=Integer.parseInt(list.pop());
                    int num2=Integer.parseInt(list.pop());
                    int result=num1*num2;
                    total=result;
                    list.push(String.valueOf(result));
                }else if(tokens[i].hashCode()==47) {
                    int num1 = Integer.parseInt(list.pop());
                    int num2 = Integer.parseInt(list.pop());
                    int result = num2 / num1;
                    total=result;
                    list.push(String.valueOf(result));
                }
                else{
                    list.push(tokens[i]);
                }
            }
            return total;
        }
    }
}
