package March_2023;
// Date: 3rd March, 2023
import java.util.Objects;
public class Find_The_Index_Of_The_Occurrence_In_A_String {
    //Runtime: 0ms beats 100%, Memory: 40.7MB beats 30.23%
    public int strStr(String haystack, String needle) {
        int lenOfNeedle=needle.length();
        int lenOfHayStack=haystack.length();
        if (lenOfNeedle <= lenOfHayStack) {
            for (int i = 0; i < lenOfHayStack; i++) {
                if (haystack.charAt(i) == needle.charAt(0) && (i-1)+lenOfNeedle<lenOfHayStack) {
                    String sub = haystack.substring(i, i+lenOfNeedle);
                    if (Objects.equals(sub, needle)) return i;
                }
            }
        }
        return -1;
    }
    public static void main(String...args){
        var result=new Find_The_Index_Of_The_Occurrence_In_A_String().strStr("Hello","ll");
        var result2=new Find_The_Index_Of_The_Occurrence_In_A_String().strStr("mississippi","issippi");
        System.out.println(result);
        System.out.println(result2);
    }
}
