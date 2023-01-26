package January_2023.Jan_15th_2023;

public class RemoveElement {
    //Runtime: 0ms beats 100%, Memory: 40.7MB beats 91.29%
    public int removeElement(int[] nums, int val) {
        int writePointer=0;
        for(int i:nums){
            if(i!=val)nums[writePointer++]=i;
        }
        return writePointer;
    }
}
