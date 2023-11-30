package January_2023.Jan_15th_2023;
public class RemoveZeroes {
    //Runtime:0ms beats 100%, Memory: 43.9MB beats 62.36%
    public void moveZeroes(int[] nums) {
        int writePointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)nums[writePointer++]=nums[i];
        }
        for(int i=writePointer;i<nums.length;i++)nums[i]=0;
        System.out.println(java.util.Arrays.toString(nums));
    }
    public static void main(String...args){
        new RemoveZeroes().moveZeroes(new int[]{0,1,0,3,12});
    }
}
