package JAN_7_2023;

public class RemoveElement {
    //Runtime: 0ms beats 100%, Memory: 40.9MB beats 75.14%
    public int removeElement(int[] nums, int val) {
        int total=nums.length;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                total--;
            }else{
                nums[cnt++]=nums[i];
            }
        }
        for(int i=cnt;i<nums.length;i++)nums[i]=0;
        System.out.println(java.util.Arrays.toString(nums));
        return total;
    }
    public static void main(String...args){
        new RemoveElement().removeElement(new int[]{3,2,2,3},3);
        new RemoveElement().removeElement(new int[]{0,1,2,2,3,0,4,2},2);
    }
}
