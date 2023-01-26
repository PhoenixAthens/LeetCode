package October_2022.Still_Working_On_IT;

import java.util.*;
public class Contains_Duplicate_III {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(arr.size()>5000){
                arr=new HashMap<>();
            }
            arr.put(i,nums[i]);
            for(int j=0;j<arr.size();j++){
                if(j!=i){
                    if (Math.abs(nums[i]-arr.get(j))<=valueDiff && Math.abs(i-j)<=indexDiff){
                        return true;
                    }
                }

            }
        }return false;
    }
    public static void main(String...args){
        //[1,2,3,1], indexDiff = 3, valueDiff = 0
        //[8,7,15,1,6,1,9,15]
        System.out.println(containsNearbyAlmostDuplicate(new int[]{8,7,15,1,6,1,9,15},1,3));
    }
}
