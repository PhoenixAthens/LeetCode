package February_2023;
//Date: 20th Feb 2023
public class SearchInsertPosition {
    //Runtime: 0ms beats 100%, Memory:42.1MB beats 27.56%
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target)return i;
        }
        return nums.length;
    }
}
