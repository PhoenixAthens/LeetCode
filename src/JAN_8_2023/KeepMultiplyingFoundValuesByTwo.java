package JAN_8_2023;

public class KeepMultiplyingFoundValuesByTwo {
    //Runtime:1ms beats 94.83%, Memory: 41.6MB beats 98.7%
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original*=2;
                i=-1;
            }
        }
        return original;
    }
}
