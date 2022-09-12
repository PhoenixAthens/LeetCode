import java.util.*;
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        List<int[]> sumArray=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            for(int i=j+1;i<nums.length;i++){
                int[] setOfIntegers=new int[2];
                int firstElement=nums[j];
                int temp=firstElement+nums[i];
                if(temp==target){
                    setOfIntegers[0]=i;
                    setOfIntegers[1]=j;
                    sumArray.add(setOfIntegers);
                }
            }
        }
        return sumArray.get(0);
    }

}
