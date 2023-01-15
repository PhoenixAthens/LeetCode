package JAN_15_2023;

import java.util.Arrays;

public class ThirdMaximumNumber {
    //Runtime: 4ms beats 61.1%, Memory: 41.6MB beats 99.7%
    public int thirdMax(int[] nums) {
        Arrays.parallelSort(nums);

        int count=1;
        int prev=nums[nums.length-1];
        int max=prev;
        for(int i=nums.length-2;i>=0;i--){
            if(prev!=nums[i]){
                prev=nums[i];
                count++;
            }
            max=Math.max(max,nums[i]);
            if(count==3)return prev;
        }
        return max;
    }

}
