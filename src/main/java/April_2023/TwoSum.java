package April_2023;
import java.util.HashMap;
public class TwoSum {
    //Runtime: 1ms beats 99.32%, Memory: 43MB beats 40.27%
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remain=target-nums[i];
            Integer fromMap=map.get(remain);
            if(fromMap!=null){
                return new int[]{i,fromMap};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
