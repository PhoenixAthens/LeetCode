import java.util.*;

public class Reverse_Words_in_a_String {
    //Incorrect Solution but works to create a reverse character String
    public String reverseWords(String s) {

        String[] fromS=s.trim().split("");
        ArrayDeque<String> returner=new ArrayDeque<>();
        for(int i=0;i< fromS.length;i++){
            if((returner.isEmpty() && fromS[i].equals(" "))||(i==fromS.length-1 && fromS[i].equals(" "))){
                System.out.println(i);
                continue;
            }else if((i!=0 && !returner.isEmpty()) && returner.peek().equals(" ") && fromS[i].equals(" ")){
                continue;
            }else{
                returner.push(fromS[i]);
            }
        }
        System.out.println(returner);
        StringBuilder build=new StringBuilder();
        while(!returner.isEmpty()){
            build.append(returner.pop());
        }
        //System.out.println(Arrays.toString(s.trim.split(" ")));
        return build.toString();
    }
    public static void main(String...args){
        System.out.println(new Reverse_Words_in_a_String().reverseWords( "  hello world  "));

    }
}
