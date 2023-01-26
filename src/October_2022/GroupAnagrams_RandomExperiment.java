package October_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams_RandomExperiment {
    //Time:19MS,Memory:56MB
    public static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> main=new ArrayList<>();
        HashMap<String,List<String>> tempMap=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            /*Checker(tempMap,strs[i]);*/
            char[] mainStr=strs[i].toCharArray();
            Arrays.parallelSort(mainStr);
            String tempString=new String(mainStr);
            if(tempMap.containsKey(tempString)){
                tempMap.get(tempString).add(strs[i]);
            }else{
                tempMap.put(tempString,new ArrayList<>(List.of(strs[i])));
            }

        }
        for(String s:tempMap.keySet()){
            ArrayList<String> temp = new ArrayList<>(tempMap.get(s));
            main.add(temp);
        }
        return main;

    }
}
