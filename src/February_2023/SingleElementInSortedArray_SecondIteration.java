package February_2023;

public class SingleElementInSortedArray_SecondIteration {
    //Runtime: 1ms beats 30.10%, Memory: 57.7Mb beats 12.71%
    public int singleNonDuplicate(int[] nums) {
        int sumOnes=0;
        int sumDoubles=0;
        int len=nums.length;
        for(int i:nums)sumOnes+=i;
        for(int i=0;i<len;i+=2)sumDoubles+=nums[i];
        return (sumDoubles*2)-sumOnes;
    }
}
