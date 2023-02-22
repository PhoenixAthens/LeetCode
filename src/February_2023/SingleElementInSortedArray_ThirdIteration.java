package February_2023;

public class SingleElementInSortedArray_ThirdIteration {
    //Runtime: 1ms beats 30.10%, Memory: 12.68%
    public int singleNonDuplicate(int[] nums) {
        int sumOnes=0;
        int sumDoubles=0;
        int len=nums.length;
        for(int i=1;i<len;i+=2){
            sumDoubles+=nums[i-1];
            sumOnes+=(nums[i]+nums[i-1]);
        }
        sumDoubles+=nums[len-1];
        sumOnes+=nums[len-1];
        System.out.println(sumOnes+" : "+sumDoubles);

        return (sumDoubles*2)-sumOnes;
    }
    public static void main(String...args){
        new SingleElementInSortedArray_ThirdIteration().singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8});
    }
}
