package Programs_That_Led_To_OutOfMemoryError;//Longest Substring Without Repeating Characters
import java.util.*;
public class LongestSubstring {
    private static int CheckPoint=0;
    public static int lengthOfLongestSubstring(String s) {
        char[] requiredArray=s.toCharArray();
        List<List<Character>> listOfAllSubStrings=new ArrayList<>();
        while(CheckPoint!=(requiredArray.length-1)){
            List<Character> obtainedArray=SubStringCreator(requiredArray,CheckPoint);
            listOfAllSubStrings.add(obtainedArray);
        }
        System.out.println(listOfAllSubStrings);
        CheckPoint=0;
        int maxLength=0;
        for(List<Character> get:listOfAllSubStrings){
            if(get.size()>maxLength){
                maxLength= get.size();
            }
        }
        return maxLength;
    }
    public static void main(String...args){/*
        int obtainedLength=lengthOfLongestSubstring("abcabcbb");
        System.out.println("Obtained max length: "+obtainedLength);*/
        int secondString=lengthOfLongestSubstring("bbbbb");
        System.out.println("Obtained max length: "+secondString);
        System.out.println("Obtained max length: "+lengthOfLongestSubstring("pwwkew"));
        System.out.println("Obtained max length: "+lengthOfLongestSubstring("uhauiwfa"));


    }
    public static List<Character> SubStringCreator(char[] main,int checkPoint){
        List<Character> listOF=new ArrayList<>();
        for(int i=checkPoint;i<main.length;i++){
            if(listOF.contains(main[i])){
                CheckPoint=i;
                return listOF;
            }else{
                listOF.add(main[i]);
            }
        }
        return listOF;
    }

}
