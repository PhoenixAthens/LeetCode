package January_2023.Jan_6th_2023;

import java.util.Arrays;

public class MergerSortedArray_ElementarySol {
    //Runtime: 2ms beats 18.80%, Memory: 42.3MB beats 80.61%
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[j++];
        }
        Arrays.parallelSort(nums1);
    }
}

