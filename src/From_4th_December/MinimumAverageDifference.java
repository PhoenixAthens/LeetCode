package From_4th_December;
public class MinimumAverageDifference {
    //works for 60/78 test case
    //On test case 61, TIME LIMIT EXCEEDED
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
        int fromBeginning=i+1;
        int fromLast=nums.length-i-1;
        int sum1=0;
        int sum2=0;
        if(fromBeginning!=0){
            for(int in=0;in<fromBeginning;in++){
                sum1+=nums[in];
            }
            sum1/=fromBeginning;
        }
        if(fromLast!=0){
            int tempo=fromLast;
            int in=nums.length-1;
            while(fromLast!=0){
                sum2+=nums[in];
                in-=1;
                fromLast-=1;
            }
            sum2/=tempo;
        }

        return (int)Math.abs((Math.floor(sum1)-Math.floor(sum2)));
    }
    public static void main(String...args){
        System.out.println(minimumAverageDifference(new int[]{0}));
    }
}
