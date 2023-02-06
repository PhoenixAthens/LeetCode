package February_2023;

import java.util.Arrays;
//Date: 6th february, 2023
public class ShuffleTheArray {
    //Runtime: 0ms beats 100%, Memory: 42MB beats 98.38%;
    public int[] shuffle(int[] nums, int n) {
        int[] answer=new int[2*n];
        int place=0;
        for(int i=0;i<n;i++){
            answer[place]=nums[i];
            answer[++place]=nums[i+n];
            place++;
        }
        return answer;
    }
    public static void main(String...args){
        System.out.println(Arrays.toString(new ShuffleTheArray().shuffle(new int[]{2,5,1,3,4,7},3)));
        System.out.println(Arrays.toString(new ShuffleTheArray().shuffle(new int[]{1,2,3,4,4,3,2,1},4)));
    }
}
