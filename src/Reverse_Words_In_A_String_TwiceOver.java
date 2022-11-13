import java.util.*;
public class Reverse_Words_In_A_String_TwiceOver {
    // Runtime:23MS, Memory:59.3MB
    public String reverseWords(String s) {
        s=s.trim();
        ArrayDeque<String> deque=new ArrayDeque<>();
        while(s!=null){
            int index=s.indexOf(' ');
            if(index!=-1){
                deque.push(s.substring(0,index));
                s=s.substring(index+1).trim();
            }else{
                deque.push(s);
                s=null;
            }
        }
        StringBuilder build=new StringBuilder();
        while(!deque.isEmpty()){
            String poppy=deque.pop();
            if(deque.peek()!=null){
                build.append(poppy);
                build.append(" ");
            }else{
                build.append(poppy);
            }
        }
        return build.toString();
    }
    public static void main(String...args){
        System.out.println(new Reverse_Words_In_A_String_TwiceOver().reverseWords( "  hello world  "));
    }
}
