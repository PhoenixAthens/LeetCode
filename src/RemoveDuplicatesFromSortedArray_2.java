
import java.util.*;

public class RemoveDuplicatesFromSortedArray_2 {
    //Time: 12ms, memory=48.8MB
    public int removeDuplicates(int[] nums) {
        //[0,0,1,1,1,2,2,3,3,4]
        int[] cope=Arrays.copyOf(nums,nums.length);
        int j=1;
        for(int i=1;i<cope.length;i++){
            if(cope[i]>cope[i-1]){
                nums[j]=cope[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }
    public static void main(String...args){
        System.out.println(new RemoveDuplicatesFromSortedArray_2().removeDuplicates(new int[]{0,0,0,3}));
    }
}
