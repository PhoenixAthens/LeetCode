package From_4th_December;
public class MinimumAverageDifference_FourthIteration{
    //Runtime:37ms, Memory:76.4MB
        public static int minimumAverageDifference(int[] nums) {
            int len=nums.length;
            long[] prefix=new long[len+1];
            long[] suffix=new long[len+1];
            for(int i=0;i<len;i++){
                prefix[i+1]=prefix[i]+nums[i];
            }
            for(int i=len-1;i>=0;i--){
                suffix[i]=suffix[i+1]+nums[i];
            }
            int min=Integer.MAX_VALUE;
            int run=-1;
            for(int i=0;i<len;i++){
                long leftPart=prefix[i+1];
                leftPart/=(i+1);
                long rightPart=suffix[i+1];
                if(i!=len-1) rightPart/=(len-i-1);
                int curDiff=(int)Math.abs(leftPart-rightPart);
                if(curDiff<min){
                    min=curDiff;
                    run=i;
                }
            }
            return run;
        }

}
