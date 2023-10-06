package LinkedIN_Learning.Java_Algorithms;

public class Majority_Element {
    //Runtime: 1ms, Memory: 48.85MB
    public int majorityElement(int[] nums) {
        int count1 = 0, candidate = 0;
        for(int n: nums){
            if(n==candidate)count1++;
            else if(count1==0){
                candidate = n;
                count1++;
            }else{
                count1--;
            }
        }
        return candidate;
    }
}
