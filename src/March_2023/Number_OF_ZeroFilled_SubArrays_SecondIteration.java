package March_2023;
//Date: 22nd March 2023
public class Number_OF_ZeroFilled_SubArrays_SecondIteration {
    //Runtime: 5ms beats 40.75%, Memory: 59.7MB beats 72.41%

    /* Compact solution!
    * public long zeroFilledSubarray(int[] nums) {
        long total=0;
        long count=0;
        for(int i:nums){
            if(i==0)count++;
            else if(count>0){
                total+=(count*(count+1)/2);
                count=0;
            }
        }
        return total+(count*(count+1)/2);
    }
    * */
    public long zeroFilledSubarray(int[] nums) {
        long total=0;
        long count=0;
        for(int i:nums){
            if(i==0){
                count++;
            }
            else if(count>0){
                long sum=count*(2+count-1)/2;
                total+=sum;
                count=0;
            }
        }
        if(count!=0){
            long sum=count*(2+count-1)/2;
            total+=sum;
        }
        return total;
    }
    public static void main(String...args){
        System.out.println(new Number_OF_ZeroFilled_SubArrays_SecondIteration().zeroFilledSubarray(new int[]{1,3,0,0,2,0,0,4}));
        System.out.println(new Number_OF_ZeroFilled_SubArrays_SecondIteration().zeroFilledSubarray(new int[]{0,0,0,2,0,0}));
    }
}
