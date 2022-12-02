package From_2nd_December;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class DetermineIfTwoStringsAreClose_SecondIteration {
    //works for 150/152 test cases
    //fails at 150th test case
    public static boolean closeStrings(String word1, String word2) {
        //works for 131/152 test cases
        //fails at 131st test case
        if(word1.length()!=word2.length()){
            return false;
        }else{
            TreeMap<String,Integer> map1=new TreeMap<>();
            TreeMap<String,Integer> map2=new TreeMap<>();
            ArrayList<String> fromWord1=new ArrayList<>(Arrays.asList(word1.split("")));
            ArrayList<String> fromWord2=new ArrayList<>(Arrays.asList(word2.split("")));
            for(int i=0;i<fromWord2.size();i++) {
                String present = fromWord1.get(i);
                String drop = fromWord2.get(i);
                if (!fromWord2.contains(present) || !fromWord1.contains(drop)) {
                    return false;
                }else{
                    if(map1.containsKey(present)){
                        map1.put(present,map1.get(present)+1);
                    }else{
                        map1.put(present,1);
                    }
                    if(map2.containsKey(drop)){
                        map2.put(drop,map2.get(drop)+1);
                    }else{
                        map2.put(drop,1);
                    }
                }
            }
            ArrayList<Integer> first=new ArrayList<>(map1.values());
            //first.sort(null);
            ArrayList<Integer> second=new ArrayList<>(map2.values());
            //second.sort(null);
            System.out.println(map1);
            System.out.println(map2);
            return first.containsAll(second);
        }
    }
    public static void main(String...args){
        System.out.println(closeStrings("aaabbbbccddeeeeefffff","aaaaabbcccdddeeeeffff"));
    }
}
