package JAN_4_2023;

public class MaxConsecutiveOnes {
    //Runtime: 5ms beats 40.11%, Memory: 57MB beats 26.49%
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int prevCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)prevCount++;
            else{
                count=Math.max(count,prevCount);
                prevCount=0;
            }
        }
        count=Math.max(count,prevCount);
        return count;
    }
}
