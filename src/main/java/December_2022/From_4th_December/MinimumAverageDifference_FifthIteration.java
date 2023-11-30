package December_2022.From_4th_December;

public class MinimumAverageDifference_FifthIteration {
    // RunTime: 23ms beats 73.58%, Memory:72.9MB beats 79.26%
    public static int minimumAverageDifference(int[] nums) {
        int len=nums.length;
        int run=-1;
        long total=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            total+=i;
        }
        long  currentSum=0;
        for(int i=0;i<len;i++){
            currentSum+=nums[i];
            long leftPart=currentSum;
            long rightPart=total-leftPart;
            leftPart/=(i+1);
            if(rightPart!=0)rightPart/=(len-i-1);
            int calc=(int)Math.abs(leftPart-rightPart);
            if(calc<min){
               run=i;
               min=calc;
            }
        }
        return run;
    }
}
