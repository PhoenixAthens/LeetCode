package September_2022;

import java.util.ArrayDeque;
public class Palindrome {

    public static void EntryPoint(String s){
        String req=s.toLowerCase();
        ArrayDeque<Character> dequeOFChars=new ArrayDeque<>();
        char[] arrayFromString=req.toCharArray();
        for(char a:arrayFromString){
            dequeOFChars.addFirst(a);
        }
        if(PalindromeChecker(arrayFromString,dequeOFChars)){
            System.out.println("We have a palindrome");
        }else{
            System.out.println("not a palindrome!");
        }
    }
    public static boolean PalindromeChecker(char[] array,ArrayDeque<Character> deque){
        int counter=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==deque.removeFirst()){
                counter++;
            }
        }
        if(counter == array.length){
            return true;
        }
        return false;
    }
    public static void main(String...args){
        EntryPoint("");
    }
}
