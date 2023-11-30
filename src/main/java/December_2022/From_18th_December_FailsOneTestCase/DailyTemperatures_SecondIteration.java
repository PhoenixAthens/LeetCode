package December_2022.From_18th_December_FailsOneTestCase;
import java.util.Arrays;
public class DailyTemperatures_SecondIteration {
    public int[] dailyTemperatures(int[] temperatures){
        int len=temperatures.length;
        int[] result=new int[len];
        result[len-1]=0;
        // we could remember the index
        int index=0;
        int at=0;
        for(int i=0;i<len-1;i++){
            int count=1;
            if(temperatures[i+1]>temperatures[i]){
                result[at]=count;
                index=i+1;
            }
            else{
                int j;
                if(temperatures[i]>=temperatures[index])j=index+1;
                else j=i+1;
                for(;j<len;j++){
                    if(temperatures[j]>temperatures[i]){
                        result[at]=count;
                        index=j;
                        break;
                    }
                    count++;
                }

            }
            at++;
        }
        return result;
    }
    public static void main(String...args){
        System.out.println(Arrays.toString(new DailyTemperatures_SecondIteration().dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
        System.out.println(Arrays.toString(new DailyTemperatures_SecondIteration().dailyTemperatures(new int[]{30,40,50,60})));
        System.out.println(Arrays.toString(new DailyTemperatures_SecondIteration().dailyTemperatures(new int[]{55,38,53,81,61,93,97,32,43,78})));
    }
}
