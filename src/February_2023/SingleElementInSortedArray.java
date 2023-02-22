package February_2023;
//Date: 22nd Feb 2023
public class SingleElementInSortedArray {
    //Runtime: 1ms beats 30.10%, Memory: 58.1MB beats 12.68%
    public int singleNonDuplicate(int[] nums) {
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1])return nums[i];
        }
        return nums[nums.length-1];
    }
}
