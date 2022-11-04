import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    //985/987 test cases passed
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder arr=new StringBuilder();
        int prevLength=0;
        for(int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++) {
                String p=String.valueOf(s.charAt(j));
                if (arr.lastIndexOf(p)!=-1) {
                    if(arr.length()>prevLength){
                        prevLength=arr.length();
                    }
                    arr = new StringBuilder();
                } else {
                    arr.append(p);
                }
            }
            if(arr.length()>prevLength)prevLength=arr.length();
            arr=new StringBuilder();
        }
        return prevLength;
    }
    public static void main(String...args){
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
