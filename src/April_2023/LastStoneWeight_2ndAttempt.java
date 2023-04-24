package April_2023;

import java.util.Arrays;
//Date: 24th April 2023
public class LastStoneWeight_2ndAttempt {
    //Runtime: 2ms beats 20.25%, Memory: 40.8MB beats 7.73%
    public int lastStoneWeight(int[] stones) {
        while(stones.length>1){
            Arrays.parallelSort(stones);
            int[] arr;
            if(stones[stones.length-1]==stones[stones.length-2]){
                arr =new int[stones.length-2];
                System.arraycopy(stones, 0, arr, 0, stones.length - 2);

            }else{
                arr =new int[stones.length-1];
                System.arraycopy(stones, 0, arr, 0, stones.length - 2);
                arr[arr.length-1]=stones[stones.length-1]-stones[stones.length-2];
            }
            stones=arr;
        }
        if(stones.length==1)return stones[0];
        return 0;
    }
}
