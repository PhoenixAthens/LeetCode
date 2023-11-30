package September_2023;
import java.util.Arrays;
import java.util.HashMap;

public class Most_Frequent_Even_Element {
    public int mostFrequentEven_0(int[] nums) {
        int count = 0, candidate = 0;
        for(int i:nums){
            if(i%2==0){
                if(i == candidate)count++;
                else if(count==0){
                    candidate = i;
                    count++;
                }else{
                    count-=1;
                }
            }
        }
        return candidate;
    }

    //Runtime: 17ms, Memory: 43.41MB
    public int mostFrequentEven_1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int start = -1;
        for(int i:nums){
            if(i%2==0){
                start = i;
                int val = map.getOrDefault(i,0);
                map.put(i,val+1);
            }
        }
        if(start==-1)return start;
        int result = start;
        int occurenceOfResult = map.get(result);
        for(int i:map.keySet()){
            int newOne = map.get(i);
            if(newOne > occurenceOfResult){
                result = i;
                occurenceOfResult = newOne;
            }else if(newOne == occurenceOfResult && i<result){
                result = i;
            }
        }
        return result;
    }

    //Runtime: 26ms, Memory: 43.48MB
    public int mostFrequentEven_2(int[] nums) {
        int[] evens = Arrays.stream(nums).filter(x->x%2==0).toArray();
        if(evens.length==0)return -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:evens){
            int val = map.getOrDefault(i,0);
            map.put(i,val+1);
        }
        int result = evens[0];
        int occurenceOfResult = map.get(result);
        for(int i:map.keySet()){
            int newOne = map.get(i);
            if(newOne > occurenceOfResult){
                result = i;
                occurenceOfResult = newOne;
            }else if(newOne == occurenceOfResult && i<result){
                result = i;
            }
        }
        return result;
    }
}
