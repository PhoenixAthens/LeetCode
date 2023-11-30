package December_2022.From_4th_December;

public class MinimumAverageDifference_ThirdIteration {
    //works for 74/78 test cases
    // fails at 75th test case
    public static int minimumAverageDifference(int[] nums) {
        int len=nums.length;
        int[] prefix=new int[len+1];
        int[] suffix=new int[len+1];
        int sum=0;
        prefix[0]=0;
        for(int i=1;i<prefix.length;i++){
            sum+=nums[i-1];
            prefix[i]=sum;
        }
        suffix[0]=sum;
        for(int i=1;i<suffix.length;i++){
            sum-=nums[i-1];
            suffix[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        int run=0;
        for(int i=0;i<len;i++){
            int calc;
            if(i==len-1){
                calc=(int)Math.abs(Math.floor((prefix[i+1]/(i+1))));
            }else {
                calc = (int) Math.abs(Math.floor(prefix[i + 1] / (i + 1)) - Math.floor(suffix[i + 1] / (len - i - 1)));
            }
            if(calc<min){
                min=calc;
                run=i;
            }
        }
        return run;
    }
    public static void main(String...args){
        System.out.println(minimumAverageDifference(new int[]{2,5,3,9,5,3}));
    }
}
