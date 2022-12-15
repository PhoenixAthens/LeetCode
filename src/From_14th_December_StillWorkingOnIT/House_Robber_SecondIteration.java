package From_14th_December_StillWorkingOnIT;

public class House_Robber_SecondIteration {
    //[4,1,2,7,5,3,1]
    //works for 42/68
    //fails on 43rd test case
    public static int rob(int[] nums){
        int len=nums.length;
        if(len==1){
            return nums[0];
        }else if(len==2){
            return Math.max(nums[0],nums[1]);
        }else{
            int prev=0;
            for(int i=2;i<len;i++){
                int SumA=0;
                int SumB=0;
                int SumC=0;
                int SumD=0;
                for(int j=0;j<len;j+=i){
                    SumA+=nums[j];
                }
                prev=Math.max(prev,SumA);
                for(int j=1;j<len;j+=i){
                    SumB+=nums[j];
                }
                prev=Math.max(SumB,prev);
                int temp=i;
                if(len>6){
                    if(i>=len/2){
                        for(int j=0;j<len;j+=temp--){//4,1,2,7,5,3,1
                            SumC+=nums[j];
                            if(temp==1)break;
                        }
                        temp=i;
                        prev=Math.max(prev,SumC);
                        for(int j=1;j<len;j+=temp--){
                            SumD+=nums[j];
                            if(temp==1)break;
                        }
                        prev=Math.max(prev,SumD);
                    }else{
                        for(int j=0;j<len;j+=temp++){
                            SumC+=nums[j];
                            if(temp==1)break;
                        }
                        temp=i;
                        prev=Math.max(prev,SumC);
                        for(int j=1;j<len;j+=temp++){
                            SumD+=nums[j];
                            if(temp==1)break;
                        }
                        prev=Math.max(prev,SumD);
                    }
                }
            }
            return prev;
        }
    }
    public static void main(String...args){
        System.out.println(rob(new int[]{4,1,2,7,5,3,1}));
    }
}
