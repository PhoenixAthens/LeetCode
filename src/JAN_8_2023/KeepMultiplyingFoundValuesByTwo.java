package JAN_8_2023;

public class KeepMultiplyingFoundValuesByTwo {
    //Better Runtime
    //Runtime:0ms beats 100%, Memory: 42MB beats 82.91%
    public int findFinalValue_2(int[] nums, int original) {
            while(check(nums,original)){
                original*=2;
            }
            return original;
    }
    public boolean check(int[] nums,int original){
        for(int i:nums){
            if(i==original)return true;
        }
        return false;
    }
    //Better Memory consumption
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
    //Alternate options
    // the code below also takes 1ms of runtime
    /*public int findFinalValue(int[] nums, int original) {
        bozo:
        for(int i=0;i<nums.length;i++){
            int j=0;
            for(;j<nums.length;j++){
                if(nums[j]==original){
                    original*=2;
                    break;
                }
            }
            if(j==nums.length)break bozo;

        }
        return original;
    }*/