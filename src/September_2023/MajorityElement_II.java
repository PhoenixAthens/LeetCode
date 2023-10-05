package September_2023;
import java.util.*;
public class MajorityElement_II {
    //Runtime: 10ms, Memory: 45.96MB
    public List<Integer> majorityElement(int[] nums) {
        int metric = nums.length/3;
        HashMap<Integer,Integer> record = new HashMap<>();
        for(int i:nums){
            int value = record.getOrDefault(i,0);
            record.put(i,value+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i: record.keySet()){
            if(record.get(i)>metric)result.add(i);
        }
        return result;
    }
    /*
    public List<Integer> majorityElement(int[] nums) {
        int metric = nums.length/3;
        HashMap<Integer,Integer> record = new HashMap<>();
        HashSet<Integer> result = new HashSet<>();
        for(int i:nums){
            int value = record.getOrDefault(i,0);
            record.put(i,value+1);
            if(value+1>metric)result.add(i);
        }
        return new ArrayList<Integer>(result);
    }
    */
}
