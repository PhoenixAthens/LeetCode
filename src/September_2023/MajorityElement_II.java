package September_2023;
import java.util.*;
public class MajorityElement_II {
    //Runtime: 2ms, Memory: 47.03MB
    public List<Integer> majorityElement_Efficient(int[] nums) {
        int metric = nums.length/3;
        int count1 = 0, count2 = 0,candidate1 =0,candidate2= 1;
        for(int i: nums){
            if(i==candidate1)count1++;
            else if(i==candidate2)count2++;
            else if(count1==0){
                candidate1 = i;
                count1++;
            }else if(count2==0){
                candidate2 = i;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        ArrayList<Integer> collect = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int n:nums){
            if(n==candidate1)count1++;
            else if(n==candidate2)count2++;
        }
        if(count1>metric)collect.add(candidate1);
        if(count2>metric)collect.add(candidate2);
        return collect;
    }

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
