package September_2023;

public class First_And_Last_position_Of_Element {
    //Runtime: 1ms, Memory: 44.07MB
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        int i=0;
        for(;i<len && nums[i]!=target; i++);
        if(i<len){
            result[0]=i;
            for(i=len-1;nums[i]!=target;i--);
            result[1]=i;
            return result;
        }else{
            return new int[]{-1,-1};
        }
    }
}
