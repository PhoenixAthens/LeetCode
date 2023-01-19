package Jav_18th_2023;

public class MaximumSumCircularSubArray {
    //works for 33/111 test cases
    //After a few minor tweaks
    //works for 80/111 test cases
    //After a few minor tweaks
    //works for 106/111
    //Time limit exceeds
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length==1)return nums[0];
        int max=nums[0];
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            max=Math.max(nums[i],max);
            int tempTotal=nums[i];
            for(int j=i+1;j<nums.length;j++){
                tempTotal+=nums[j];
                max=Math.max(max,tempTotal);
            }
        }
        max=Math.max(total,max);
        for(int i=0;i<nums.length;i++){
            int j=i-1;
            int tempTotal=total;
            while(j>=0){
                tempTotal-=nums[j];
                max=Math.max(tempTotal,max);
                j--;
            }
        }
        return max;
    }
    public static void main(String...args){
        int val=new MaximumSumCircularSubArray().maxSubarraySumCircular(new int[]{1,-2,3,-2});
        int val2=new MaximumSumCircularSubArray().maxSubarraySumCircular(new int[]{5,-3,5});
        int val3=new MaximumSumCircularSubArray().maxSubarraySumCircular(new int[]{-3,-2,-3});
        System.out.println(val);
        System.out.println(val2);
        System.out.println(val3);
    }
}
