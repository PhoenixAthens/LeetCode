package October_2022.Still_Working_On_IT;

import java.util.*;

public class ContinuousSubarraySum {
    //this solution exceeds time-limit
    public static boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length==1)return false;
        int i=0;
        while(i<nums.length-1){
            int innerSum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                innerSum+=nums[j];
                if( innerSum%k==0) return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String...args){
        System.out.println(checkSubarraySum(new int[]{23,2,6,2,5},6));
        System.out.println(0%6);
    }
}
