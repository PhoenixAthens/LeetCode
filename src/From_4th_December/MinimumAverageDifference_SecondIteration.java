package From_4th_December;
import java.util.*;
public class MinimumAverageDifference_SecondIteration {
    //Works for 60/78 test cases
    //Then TIME LIMIT EXCEEDED
    public static int minimumAverageDifference(int[] nums) {
        int min=-1729;
        int index=0;
        for(int i=0;i<nums.length;i++){
            int result=AvdDiffCalculator(i,nums);
            if(min==-1729){
                min=result;
                index=i;
            }else if(result<min){
                min=result;
                index=i;
            }
        }
        return index;
    }
    public static int AvdDiffCalculator(int i,int[] nums){
        int len=nums.length;
        int sum1=0;
        int sum2=0;
        for(int j=0;j<=i;j++ ){
            sum1+=nums[j];
        }
        sum1/=i+1;
        for(int j=i+1;j<len;j++){
            sum2+=nums[j];
        }
        if(sum2!=0){
            sum2/=len-i-1;
        }
        return (int)Math.abs((Math.floor(sum1)-Math.floor(sum2)));
    }
    public static void main(String...args){
        System.out.println(minimumAverageDifference(new int[]{2,5,3,9,5,3}));
    }

}
