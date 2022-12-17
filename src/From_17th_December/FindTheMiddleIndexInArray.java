package From_17th_December;

public class FindTheMiddleIndexInArray {
    //Runtime: 0ms beats 100%, Memory: 40.7MB beats 82.96%
    public static int findMiddleIndex(int[] nums) {
        int SumR=0;
        int SumL=0;
        int len=nums.length;
        for (int num : nums) {
            SumR += num;
        }
        for(int i=0;i<len;i++) {
            SumR -= nums[i];
            if (SumL == SumR) return i;
            else SumL += nums[i];
        }
        return -1;
    }
    public static void main(String...args){
        System.out.println(findMiddleIndex(new int[]{2,3,-1,8,4}));
    }
}
