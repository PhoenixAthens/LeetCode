package JAN_7_2023;

public class RemoveDuplicatesFromSortedArray_ED2 {
    //Runtime:1ms beats 100%, Memory:44.3MB beats 67.26%
    public int removeDuplicates(int[] nums) {
        int total=nums.length;
        int cnt=1;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=prev){
                prev=nums[i];
                nums[cnt++]=prev;
            }else{
                total--;
            }

        }
        for(int i=cnt;i<nums.length;i++)nums[i]=0;
        return total;
    }
}
