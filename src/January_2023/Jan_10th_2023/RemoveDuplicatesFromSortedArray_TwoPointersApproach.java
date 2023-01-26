package January_2023.Jan_10th_2023;

public class RemoveDuplicatesFromSortedArray_TwoPointersApproach {
    //Runtime: 1ms beats 100%, Memory: 44.3MB beats 65.77%
    public int removeDuplicates(int[] nums) {
        int writePointer=1;
        for(int readPointer=1;readPointer<nums.length;readPointer++){
            if(nums[readPointer]!=nums[readPointer-1]){
                nums[writePointer]=nums[readPointer];
                writePointer++;
            }
        }
        return writePointer;
    }

}
