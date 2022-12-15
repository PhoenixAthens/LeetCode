package From_14th_December_StillWorkingOnIT;

public class House_Robber {
    //works for 41/68 test cases
    // fails at 42nd test case
    public int rob(int[] nums) {
        int len=nums.length;
        if(len==1) {
            return nums[0];
        }else if(len==2){
            return Math.max(nums[0],nums[1]);
        }else{
            //[4,1,2,7,5,3,1]=12,11,
            int prev=0;
            for(int j=2;j<nums.length;j++){
                int robA=0;
                int robB=0;
                for(int i=0;i<nums.length;i+=j){
                    robA+=nums[i];
                }
                prev=Math.max(robA,prev);
                for(int i=1;i<nums.length;i+=j){
                    robB+=nums[i];
                }
                prev=Math.max(robB,prev);

            }
            return prev;
        }

    }
}
