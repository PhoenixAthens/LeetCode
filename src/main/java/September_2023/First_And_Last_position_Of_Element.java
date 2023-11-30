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
    //Runtime: 0ms, Memory: 44.40MB
    public int[] searchRange_2(int[] nums, int target) {
        int start = binarySearch(nums,target);
        if(start==nums.length || nums[start]!=target){
            return new int[]{-1,-1};
        }else{
            int i=start;
            for(;i<nums.length && nums[i]==target;i++);
            return new int[]{start,i};
        }
    }
    public int binarySearch(int[] nums, int target){
        int l = 0;
        int h = nums.length;
        while(l < h){
            int mid = (l + (h-1))/2;
            if(target <= nums[mid]){
                h = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}
