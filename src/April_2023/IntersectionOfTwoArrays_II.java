package April_2023;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays_II {
    //Runtime: 1ms beats 98.32%, Memory: 42.9MB beats 31.73%
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] buffer=new int[1001];
        for(int i:nums1){
            buffer[i]++;
        }
        ArrayList<Integer> sol=new ArrayList<>();
        for(int i:nums2){
            if(buffer[i]!=0){
                buffer[i]--;
                sol.add(i);
            }
        }
        int size=sol.size();
        int[] result=new int[size];
        int cnt=0;
        for(int i:sol){
            result[cnt++]=i;
        }
        return result;
    }
    public static void main(String...args){
        var result1=new IntersectionOfTwoArrays_II().intersect(new int[]{1,2,2,1}, new int[]{2,2});
        var result2=new IntersectionOfTwoArrays_II().intersect(new int[]{4,9,5},new int[]{9,4,9,8,4});
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
