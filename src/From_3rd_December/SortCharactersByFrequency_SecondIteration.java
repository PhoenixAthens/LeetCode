package From_3rd_December;

import java.util.ArrayList;
import java.util.*;
import java.util.Map.Entry;

public class SortCharactersByFrequency_SecondIteration {
    //RUNTIME: 19ms beats 83.85%, Memory: 43.2MB beats 90.65%
    public String frequencySort(String s) {
        HashMap<Character,Integer> counter=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char present=s.charAt(i);
            if(counter.containsKey(present)){
                counter.put(present,counter.get(present)+1);
            }else{
                counter.put(present,1);
            }
        }
        LinkedList<Character> sorter=new LinkedList<>(counter.keySet());
        sorter.sort((x,y)->counter.get(y)-counter.get(x));
        StringBuilder build=new StringBuilder();
        for(Character i:sorter){
            for(int j=0;j<counter.get(i);j++){
                build.append(i);
            }
        }
        return build.toString();
    }
    public static void main(String...args){
        System.out.println(new SortCharactersByFrequency().frequencySort("raaeaedere"));
    }
}
