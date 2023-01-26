package December_2022.SumOfSubArrayMinimums;
import java.util.*;
public class SumOfSubArrayMinimums_ThirdIteration {
    //works for 86/87 testcases
    //fails at 87th test case :/
    public static int sumSubarrayMins(int[] arr) {
        Stack<Integer> minimums=new Stack<>();
        int totalSum=0;
        int bummer=1_000_000_007;
        int mid=0;
        int left=0;
        int right=0;
        for(int i=0;i<arr.length;i++){
            if(minimums.isEmpty() || arr[i]>arr[minimums.peek()]){
                minimums.push(i);
            }else if(arr[minimums.peek()]>=arr[i]){
                while(arr[i]<arr[minimums.peek()]){
                    mid=minimums.pop();
                    try{
                        left=minimums.peek();
                    }catch(EmptyStackException ex){
                        left=-1;
                    }
                    right=i;
                    totalSum+=(arr[mid]*(right-mid)*(mid-(left)));
                    totalSum%=bummer;
                    if(minimums.isEmpty()){
                        break;
                    }
                }
                minimums.push(i);
            }
        }
        right=arr.length;
        while(!minimums.isEmpty()){
            mid=minimums.pop();
            try{
                left=minimums.peek();
            }catch(EmptyStackException ex){
                left=-1;
            }
            totalSum+=(arr[mid]*(right-mid)*(mid-(left)));
            totalSum%=bummer;
        }
        return totalSum;
    }
    public static void main(String...arg){
        System.out.println(sumSubarrayMins(new int[]{3,1,2,4}));
        //first we have 3
        // 3 is pushed to array, meaning index 0 on array
        // then we have 1, i<3, so 3 will be popped
    }
}
