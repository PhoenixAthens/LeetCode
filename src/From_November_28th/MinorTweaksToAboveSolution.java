package From_November_28th;

import java.util.*;

public class MinorTweaksToAboveSolution {
    //Lambdas are better
    //The solution below took: Runtime:333ms, Memory:157.3MB
    public static List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> record=new HashMap<>();
        for(int[] i:matches){
            record.put(i[0],0);
            record.put(i[1],0);
        }
        for (int[] match : matches) {
            int presentKey = match[1];
            if (record.containsKey(presentKey)) {
                record.put(presentKey, record.get(presentKey) + 1);
            }
        }
        TreeSet<Integer> set1=new TreeSet<>();
        TreeSet<Integer> set2=new TreeSet<>();
        for(int i:record.keySet()){
            if(record.get(i)==0){
                set1.add(i);
            }else if(record.get(i)==1){
                set2.add(i);
            }
        }
        List<List<Integer>> make=new ArrayList<>();
        make.add(new ArrayList<>(set1));
        make.add(new ArrayList<>(set2));
        return make;
    }
}
