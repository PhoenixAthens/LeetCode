package January_2023.Jan_7th_2023;

import java.util.*;

public class MergeSortedArray_ED2{
    //Runtime: 4ms beats 18.80%, Memory:42.3MB beats 80.61%
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            if(map.containsKey(nums1[i]))map.put(nums1[i],map.get(nums1[i])+1);
            else map.put(nums1[i],1);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(nums2[i]))map.put(nums2[i],map.get(nums2[i])+1);
            else map.put(nums2[i],1);
        }
        System.out.println(map);
        System.out.println(map.keySet());
        TreeSet<Integer> tennis=new TreeSet<>(Set.copyOf(map.keySet()));
        int cnt=0;
        for(int i:tennis){
            for(int j=0;j<map.get(i);j++){
                nums1[cnt++]=i;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String...args){
        new MergeSortedArray_ED2().merge(new int[]{-1,0,0,3,3,3,0,0,0},6,new int[]{1,2,2},3);

    }
}
