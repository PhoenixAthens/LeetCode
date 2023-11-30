package April_2023;

public class Minimize_Maximum_Of_Array_Part2 {
    //Runtime: 9ms beats 74.55%, Memory: 61.7MB beats 64.87%
    public int minimizeArrayValue(int[] nums) {
        int answer=0;
        double prefixSum=0;
        for(int i=0;i<nums.length; i++){
            prefixSum+=nums[i];
            answer=Math.max(answer,(int)Math.ceil(prefixSum/(i+1)));
        }
        return answer;
    }
}
