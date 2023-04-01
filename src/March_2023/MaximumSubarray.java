package March_2023;
//Date: 1 April, 2023
public class MaximumSubarray {
    //Runtime: 14ms beats 6.16%, Memory: 52MB beats 18.74%
    public int maxSubArray(int[] nums) {
        return sumItUp(nums,0,nums.length-1);
    }
    public int sumItUp(int[] nums, int low, int high){
        if(low==high)return nums[low];
        else{
            int mid= Math.floorDiv(low+high,2);
            int leftMax,rightMax;
            leftMax=rightMax=Integer.MIN_VALUE;
            int subSUM=0;
            for(int i=mid;i>=low;i--){
                subSUM+=nums[i];
                leftMax=Math.max(leftMax,subSUM);
            }
            subSUM=0;
            for(int i=mid+1;i<=high;i++){
                subSUM+=nums[i];
                rightMax=Math.max(rightMax,subSUM);
            }
            int sides=Math.max(sumItUp(nums,low,mid),sumItUp(nums,mid+1,high));
            return Math.max(sides,leftMax+rightMax);
        }
    }
    public static void main(String...args){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2={1};
        int[] nums3={5,4,-1,7,8};
        System.out.println(new MaximumSubarray().maxSubArray(nums));
        System.out.println(new MaximumSubarray().maxSubArray(nums2));
        System.out.println(new MaximumSubarray().maxSubArray(nums3));
    }
}
