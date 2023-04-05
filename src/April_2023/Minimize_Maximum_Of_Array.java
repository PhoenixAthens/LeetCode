package April_2023;

public class Minimize_Maximum_Of_Array {
    //Time Limit Exceeded!! at 26/68
    public int minimizeArrayValue(int[] nums) {
        int[] max_N_Index=findMax(nums);
        while(max_N_Index[0]!=0){
            for(int i=max_N_Index[0];i<nums.length;i+=2){
                nums[i]-=1;
                nums[i-1]+=1;
            }
            max_N_Index=findMax(nums);
            if(max_N_Index[1]==1)break;
        }
        return max_N_Index[1];
    }
    public int[] findMax(int[] nums){
        int[] max = {0,0};
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max[1]){
                max[0]=i;
                max[1]=nums[i];
            }
        }
        return max;
    }
    public static void main(String...args){
        System.out.println(new Minimize_Maximum_Of_Array().minimizeArrayValue(new int[]{3,7,1,6}));
        System.out.println(new Minimize_Maximum_Of_Array().minimizeArrayValue(new int[]{10,1}));
    }
}
