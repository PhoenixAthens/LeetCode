package April_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    //Runtime:106ms
    //Some Improvements:
    //Runtime: 7ms beats 31.62%, Memory: 42.8MB beats 52.65%
    public int singleNumber_Deprecated(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==-1234)continue;
            int present = nums[i];
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(nums[j]==present){
                    nums[j]=-1234;
                    flag=true;
                    break;
                }
            }
            if(!flag)return present;
        }
        return nums[n-1];
    }
    public int singleNumber(int[] nums) {
        int n=nums.length;
        Arrays.parallelSort(nums);
        for(int i=0;i<n-1;i+=2){
            if(nums[i]!=nums[i+1])return nums[i];
        }
        return nums[n-1];
    }
    //Runtime: 10ms beats 29.4%
    public int singleNumber_FinalAttempt(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            Integer value=map.remove(i);
            if(value==null){
                map.put(i,1);
            }
        }
        for(int i:map.keySet())return i;
        return -1;
    }
    //Runtime: 1ms beats 100%, Memory: 43.1MB beats 25.43%
    public int singleNumber_oneLastTime(int[] nums){
        int a=0;
        for(int i:nums){
            a^=i;
        }
        return a;
    }
    public static void main(String...args){
        System.out.println(new SingleNumber().singleNumber_FinalAttempt(new int[]{2,2,1}));
        System.out.println(new SingleNumber().singleNumber_FinalAttempt(new int[]{4,1,2,1,2}));
        System.out.println(new SingleNumber().singleNumber_FinalAttempt(new int[]{1}));
        System.out.println(6^2);
    }

}
