package December_2022.From_17th_December;

public class RunningSumOf1DArray_SecondIteration {
    // First Iteration
    // Runtime: 0ms, Memory: 42.1MB
    // Second Iteration
    // Runtime: 0ms, Memory: 42MB
    // Third Iteration
    // Runtime: 0ms , Memory: 42.4MB
    public int[] runningSum(int[] nums) {
        int len=nums.length;
        for(int i=1;i<len;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
    // Replacing len with nums.length in the for-loop
    // First Iteration
    // Runtime: 0ms, Memory: 42MB
    // Second Iteration
    // Memory: 42.2MB
    // Third Iteration
    // Memory: 42.2MB

}
