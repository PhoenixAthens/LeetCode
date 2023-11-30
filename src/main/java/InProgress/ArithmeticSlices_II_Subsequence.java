package InProgress;

import java.util.*;
public class ArithmeticSlices_II_Subsequence {
    public static int numberOfArithmeticSlices(int[] nums) {
        int main=0;
        ArrayList<Integer> given=new ArrayList<>();
        Arrays.stream(nums).forEach(given::add);
        for(int i=0;i<nums.length;i++){
            int diff=0;
            int count=0;
            int prev=0;
            int jump=0;
        }
        return main++;
    }
    public static void main(String...args){
        System.out.println(numberOfArithmeticSlices(new int[]{2,4,6,8,10}));
    }
}
