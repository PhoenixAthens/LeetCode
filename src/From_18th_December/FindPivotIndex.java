package From_18th_December;
import java.util.Arrays;
public class FindPivotIndex {
    //First run:
    //Runtime: 2ms beats 80.89%, Memory: 52.5MB beats 42.6%
    //Second run
    //Runtime: 1ms beats 100%, Memory: 43.7MB beats 76.38%
    //Third run
    //Runtime: 2ms beats 80.89%, Memory: 52.4MB beats 47.25%
    public int pivotIndex(int[] nums) {
        if(nums.length==1)return 0;
        else{
            int len=nums.length;
            int SumL=0;
            int SumR=0;
            for(int i:nums){
                SumR+=i;
            }
            for(int i=0;i<len;i++){
                SumR-=nums[i];
                if(SumL==SumR)return i;
                SumL+=nums[i];
            }
            return -1;
        }
    }
    public static void main(String...args){
        System.out.println(new FindPivotIndex().pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
