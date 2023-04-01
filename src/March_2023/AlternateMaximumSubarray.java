package March_2023;
//Date: 1st April, 2023
public class AlternateMaximumSubarray {
    //Not my Solution, I just tested it out!
    //Runtime: 1ms beats 100%, Memory: 51.5MB beats 69.59%
    public int maxSubArray(int[] nums) {
        int subSum=0;
        int max=Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(subSum + num, max);
            subSum = Math.max(0, subSum + num);
        }
        return max;
    }
}
