import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    //Time:10ms, Memory:48.8MB;
    public int removeDuplicates(int[] nums) {
        //[0,0,1,1,1,2,2,3,3,4]
        int[] copy=Arrays.copyOf(nums,nums.length);
        TreeSet<Integer> make=new TreeSet<>();
        int j=0;
        for(int i:copy){
            if(make.add(i)){
                nums[j]=i;
                j++;
            }
        }
        return make.size();
    }
    public static void main(String...args){
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1,1,2}));
    }
}
