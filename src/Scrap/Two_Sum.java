package Scrap;

import java.util.*;
public class Two_Sum {
    public static List<int[]> twoSum(int[] nums, int target) {
        return sumReturner(nums, target);


    }
//    public static List<Set<Integer>> SubstituteTwoSum(int[] nums,int target){
//    }
    public static List<int[]> sumReturner(int[] sums, int target){
        List<int[]> sumArray=new ArrayList<>();
        for(int j=0;j<sums.length;j++){
            for(int i=1;i<sums.length;i++){
                int[] setOfIntegers=new int[2];
                int firstElement=sums[j];
                int temp=firstElement+sums[i];
                if(temp==target){
                    setOfIntegers[0]=i;
                    setOfIntegers[1]=j;
                    sumArray.add(setOfIntegers);
                }
            }
        }
        return sumArray;
    }
    public static void main(String...args){
        List<int[]> tom=twoSum(new int[]{3,2,4,2,4,1,0,6},6);
        for(int[] j:tom){
            Arrays.parallelSort(j);
        }
        //How to remove duplicates??
        for(int k=0;k<tom.size();k++){
            for(int z=1;z<tom.size();z++){
                if(tom.get(k).equals(tom.get(z)))
                    tom.remove(z);

            }
        }
        for(int[] k:tom){
            System.out.println(Arrays.toString(k));
        }
    }
}