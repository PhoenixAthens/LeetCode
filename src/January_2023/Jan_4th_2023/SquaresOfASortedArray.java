package January_2023.Jan_4th_2023;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SquaresOfASortedArray {
    //Runtime: 15ms beats 24.57%, Memory: 55.6MB beats 45.40%
    //after a few changes
    //
    public int[] sortedSquares(int[] nums) {
        IntStream.range(0, nums.length).forEachOrdered(i -> nums[i] = nums[i] * nums[i]);
        Arrays.parallelSort(nums);
        return nums;
    }
}
