package May_2023;

public class Number_Of_SubSequences_That_Satisfy_TheGivenSumCondition {
    public int numSubseq(int[] nums, int target) {
        int start=0;
        int count=0;
        for(int end=0;end<nums.length;end++){
            if(nums[start]+nums[end]>target){
                count+=(int)Math.pow(2,end-start);
                while(start<nums.length && nums[start]+nums[end]>target){
                    start++;
                }
                if(start==nums.length-1)break;
            }
        }
        return count;
    }
    public static void main(String...args){
        System.out.println(new Number_Of_SubSequences_That_Satisfy_TheGivenSumCondition().numSubseq(new int[]{3,5,6,7},9));
        System.out.println(new Number_Of_SubSequences_That_Satisfy_TheGivenSumCondition().numSubseq(new int[]{3,3,6,8},10));
        System.out.println(new Number_Of_SubSequences_That_Satisfy_TheGivenSumCondition().numSubseq(new int[]{2,3,3,4,6,7},12));
    }
}
