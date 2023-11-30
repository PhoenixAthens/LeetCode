package December_2022.From_17th_December;

public class RunningSumOf1DArray {
    //Runtime:0ms beats 100%, Memory: 41.9MB beats 99.9%
    public static int[] runningSum(int[] nums) {
        int[] make=new int[nums.length];
        make[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            make[i]=nums[i]+make[i-1];
        }
        return make;
    }
    public static void main(String...args){
        System.out.println(java.util.Arrays.toString(runningSum(new int[]{1,2,3,4})));
    }
}
