import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        if(nums.length==2 && nums[0]==1){
            return new int[]{1,2};
        }
        HashMap<Integer,Integer> findingMiss=new HashMap<>();
        int max=nums.length;
        int k=0;
        int[] turnIn=new int[2];
        for(int i:nums){
            if(findingMiss.containsKey(i)){
                turnIn[0]=i;
            }
            findingMiss.put(i,k);
            k++;
        }
        int missing=0;
        for(int i=1;i<max+1;i++){
            if(!findingMiss.containsKey(i)){
                missing=i;
            }
        }
        if(missing!=0){
            turnIn[1]=missing;
        }else{
            turnIn[1]=max+1;
        }
        return turnIn;
    }
    public static void main(String...args){
        System.out.println(Arrays.toString(new SetMismatch().findErrorNums(new int[]{1,2,2,4})));
    }

}
