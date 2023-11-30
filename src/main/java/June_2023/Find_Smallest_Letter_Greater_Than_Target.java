package June_2023;

public class Find_Smallest_Letter_Greater_Than_Target {
    //Runtime: 0ms, Memory: 44.3MB
    public char nextGreatestLetter(char[] letters, char target) {
        char first = '{';
        for(char c : letters){
            if(c>target && c<first){
                first = c;
            }
        }
        if(first=='{')first=letters[0];
        return first;
    }
    public static void main(String...args){
        int val='z';
        System.out.println((char)123);
    }
}
