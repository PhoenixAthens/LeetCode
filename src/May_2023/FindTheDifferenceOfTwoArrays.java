package May_2023;
import java.util.*;
//Date: May 3rd 2023
public class FindTheDifferenceOfTwoArrays {
    //Runtime: 11ms beats 86.46%, Memory: 43.4MB beats 54.45%
    /*
    Input: nums1 = [1,2,3], nums2 = [2,4,6]
    Output: [[1,3],[4,6]]

    Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
    Output: [[3],[]]
    */
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i : nums1) map1.put(i, 1);
        for (int i : nums2) map2.put(i, 1);
        List<Integer> fromNum1 = new ArrayList<>();
        List<Integer> fromNum2 = new ArrayList<>();
        for (int i : map1.keySet()) {
            if (map2.get(i) == null) fromNum1.add(i);
        }
        for (int i : map2.keySet()) {
            if (map1.get(i) == null) fromNum2.add(i);
        }
        List<List<Integer>> combinator=new ArrayList<>();
        combinator.add(fromNum1);
        combinator.add(fromNum2);
        return combinator;
    }
}
