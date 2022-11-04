import java.util.*;
public class ReverseVowelsOf_A_String {
    public static String reverseVowels(String s) {
        ArrayList<Character> vowels=new ArrayList<>(Arrays.asList('A','a','E','e','I','i','O','o','U','u'));
        Stack<Character> found=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(vowels.contains(s.charAt(i))){
                found.push(s.charAt(i));
            }
        }
        StringBuilder build=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char present=s.charAt(i);
            if(vowels.contains(present)){
                build.append(found.pop());
            }else{
                build.append(present);
            }
        }
        return build.toString();
    }
    public static void main(String...args){
        System.out.println(reverseVowels("Hello"));
    }
}
