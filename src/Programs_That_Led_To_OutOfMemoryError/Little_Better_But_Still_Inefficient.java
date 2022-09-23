package Programs_That_Led_To_OutOfMemoryError;

import java.util.ArrayList;
import java.util.List;

public class Little_Better_But_Still_Inefficient {
    private static int CheckPoint=0;
    public static int lengthOfLongestSubstring(String s) {
        char[] requiredArray=s.toCharArray();
        List<Integer> listOfAllSubStrings=new ArrayList<>();
        while(CheckPoint!=(requiredArray.length-1)){
            int obtainedArray=SubStringCreator(requiredArray,CheckPoint);
            listOfAllSubStrings.add(obtainedArray);
        }
        listOfAllSubStrings.sort(null);
        System.out.println(listOfAllSubStrings);
        return listOfAllSubStrings.get(listOfAllSubStrings.size()-1);



    }
    public static void main(String...args){/*
        int obtainedLength=lengthOfLongestSubstring("abcabcbb");
        System.out.println("Obtained max length: "+obtainedLength);*/
        long time=System.currentTimeMillis();
        int secondString=lengthOfLongestSubstring("kkkkkkkkkkkkk");
        time=System.currentTimeMillis()-time;
        System.out.println(secondString);
        System.out.println("TimeTaken: "+time);

    }
    public static int SubStringCreator(char[] main,int checkPoint){
        List<Character> listOF=new ArrayList<>();
        for(int i=checkPoint;i<main.length;i++){
            if(listOF.contains(main[i])){
                CheckPoint=i;
                return listOF.size();
            }else{
                listOF.add(main[i]);

            }
            CheckPoint=i;
        }
        return listOF.size();

    }
