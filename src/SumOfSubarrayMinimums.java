import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class SumOfSubarrayMinimums {
    //worked 77/87 test cases
    //then the TIME LIMIT EXCEEDED
    public int sumSubarrayMins(int[] arr) {
        int bummer=1000_000_007;
        int sum=0;
        for(int i=1;i<=arr.length;i++){
            int count=0;
            int min=0;
            int start=0;
            for(int j=0;j<arr.length;j++){
                int present=arr[j];
                count++;
                if(count==1){
                    min=present;
                }else if(present<min){
                    min=present;
                }
                if(count==i){
                    sum+=min;
                    sum%=bummer;
                    count=0;
                    j=start;
                    start++;
                }

            }
        }
        return sum;

    }
    public static void main(String...args){
        System.out.println(sumSubarrayMins(new int[]{11,81,94,43,3}));
    }

    //Experimental
    /*
    public static int sumSubarrayMins(int[] arr) {
            int bummer=1000_000_007;
            AtomicInteger sum2= new AtomicInteger();
            Arrays.stream(arr).forEach(x-> sum2.addAndGet(x));
            int sum=sum2.get();
            for(int i=2;i<=arr.length;i++){
                int count=0;
                int min=arr[0];
                int start=-1;
                for(int j=0;j<arr.length;j+=2){
                    int p=arr[j];
                    int p_next=0;
                    int tempMin=0;
                    if(j<arr.length-1){
                        p_next=arr[j+1];
                        tempMin= Math.min(p,p_next);
                    }else{
                        tempMin=p;
                    }

                    count+=2;
                    if(tempMin<min){
                        min=tempMin;
                    }
                    if(count==i){
                        System.out.println(min);
                        sum+=min;
                        sum%=bummer;
                        System.out.println(sum);
                        count=0;
                        j=start;
                        start++;
                        min=arr[start];
                    }
                }
            }
            return sum;
    }

    * */
}
