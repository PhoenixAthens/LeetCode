package JAN_4_2023;

public class MaxConsecutiveOnes {
    //Runtime: 5ms beats 40.11%, Memory: 57MB beats 26.49%
    //
    // After some improvements
    //
    //Runtime: 2ms beats 87.12%, Memory: 57.4MB beats 14.33%
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int prevCount=0;
        for (int num : nums) {
            if (num == 1) prevCount++;
            else {
                if(prevCount>count)count=prevCount;
                prevCount=0;
            }
        }
        if(prevCount>count)count=prevCount;
        return count;
    }
}
