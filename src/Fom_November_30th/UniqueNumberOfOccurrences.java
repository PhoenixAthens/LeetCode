package Fom_November_30th;
import java.util.*;

public class UniqueNumberOfOccurrences {
    //Time: 5ms beats 38.52%, Memory: 42.1MB beats 51.91%
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int present : arr) {
            if (!map.containsKey(present)) {
                map.put(present, 1);
            } else {
                map.put(present, map.get(present) + 1);
            }
        }
        HashSet<Integer> check=new HashSet<>(map.values());
        return check.size() >= map.values().size();
    }
    public static void main(String...args){
        System.out.println(new UniqueNumberOfOccurrences().uniqueOccurrences(new int[]{1,2}));
    }
}
