package September_2022;

import java.util.Arrays;

public class Median_Of_Two_Sorted_Arrays {
    //Runtime: 17ms beats 14.9%, Memory: 50.6MB beats 9.18%
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] CombinedArray=new int[nums1.length+ nums2.length];
        int i=0;
        for(;i<nums1.length;i++){
            CombinedArray[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++,i++){
            CombinedArray[i]=nums2[j];
        }
        Arrays.parallelSort(CombinedArray);
        if(CombinedArray.length%2==0){
            return (CombinedArray[CombinedArray.length/2-1]+CombinedArray[CombinedArray.length/2])/2.0;
        }else{
            return CombinedArray[CombinedArray.length/2];
        }
    }
    public static void main(String...args){
        System.out.println(findMedianSortedArrays(new int[]{1, 2},new int[]{3}));
    }

}
