package April_2023;

import java.util.*;

public class IntersectionOfTwoArrays {
    //Runtime: 2ms beats 96.37%, Memory: 42.6MB beats 80.82%
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> sol=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            map.put(i,1);
        }
        for(int i:nums2){
            if(map.get(i)!=null)sol.add(i);
        }
        int len3=sol.size();
        int[] arr=new int[len3];
        int j=0;
        for(int i:sol)arr[j++]=i;
        return arr;
    }
    public static void main(String...args){
        var result1=new IntersectionOfTwoArrays().intersection(new int[]{1,2,2,1},new int[]{2,2});
        var result2=new IntersectionOfTwoArrays().intersection(new int[]{4,9,5},new int[]{9,4,9,8,4});
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
