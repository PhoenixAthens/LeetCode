package February_2023;

import java.util.Arrays;

public class ShuffleTheArray_SecondIteration {
    //incorrect solution <Looking for a Space Complexity: O(1) solution>
    public int[] shuffle(int[] nums, int n) {
        int place=0;
        int prev=nums[0];
        int prev2=nums[1];
        for(int i=0;i<n;i++){
            nums[place]=prev;
            prev=nums[i+1];
            nums[++place]=nums[i+n];
            place++;
            prev2=nums[place];
        }
        return nums;
    }
    public static void main(String...args){
        System.out.println(Arrays.toString(new ShuffleTheArray_SecondIteration().shuffle(new int[]{2,5,1,3,4,7},3)));
        System.out.println(Arrays.toString(new ShuffleTheArray_SecondIteration().shuffle(new int[]{1,2,3,4,4,3,2,1},4)));
    }
}
