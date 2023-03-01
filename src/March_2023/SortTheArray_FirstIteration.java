package March_2023;
//Date: 1st March 2023
public class SortTheArray_FirstIteration {
    //Runtime:19ms 86.12%, Memory:52MB beats 81.96%
    public int[] sortArray(int[] nums) {
        java.util.Arrays.parallelSort(nums);
        return nums;
    }
}
