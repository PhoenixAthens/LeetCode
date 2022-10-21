import java.util.*;
public class ContainsDuplicateII {
    //Using array list result in TimeExceeded for nums of length above 50000
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> mappy=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mappy.containsKey(nums[i])){
                int a=mappy.get(nums[i]);
                mappy.put(nums[i],i);
                int l=mappy.get(nums[i]);
                if(Math.abs(a-l)<=k) return true;
            }else{
                mappy.put(nums[i],i);
            }
        }
        return false;

    }
    public static void main(String...args){
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }
}
