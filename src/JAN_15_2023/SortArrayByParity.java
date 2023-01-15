package JAN_15_2023;

public class SortArrayByParity {
    //Runtime: 1ms beats 100%, Memory: 43.3MB beat 72.16%
    public int[] sortArrayByParity(int[] nums) {
        int oddWriter=0;
        for(int readPointer=0;readPointer<nums.length;readPointer++){
            if((nums[readPointer]&1)!=1){
                int temp=nums[oddWriter];
                nums[oddWriter++]=nums[readPointer];
                nums[readPointer]=temp;
            }
        }
        return nums;
    }
    public static void main(String...args){
        int[] r1=new SortArrayByParity().sortArrayByParity(new int[]{3,1,2,4});
        System.out.println(java.util.Arrays.toString(r1));
        System.out.println(22&1);
    }
}
