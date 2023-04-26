package April_2023;
import java.util.HashMap;
//Date: 26th April 2023
public class ContainsDuplicates {
    //Runtime: 12ms beats 77.72%, Memory: 56.4MB beats 51.72%

    public boolean containsDuplicate(int[] nums) {

        /* 22ms approach
        Arrays.parallelSort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])return true;
        }
        return false;
        */
        /* Memory Limit Exceeded
        int val=(int)Math.pow(10,9);
        int[] pos=new int[val];
        int[] neg=new int[val];
        for(int i:nums){
            if(i<0){
                i*=i;
                if(neg[i]==1)return true;
                neg[i]=1;
            }else{
                if(pos[i]==1)return true;
                pos[i]=1;
            }

        }
        return false;
        */
        /* Time Limit Exceeded
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i:nums){
            if(numbers.contains(i))return true;
            numbers.add(i);
        }
        return false;
        */
        HashMap<Integer,Integer> counter=new HashMap<>();
        for(int i:nums){
            if(counter.get(i)!=null)return true;
            counter.put(i,1);
        }
        return false;

    }
}
