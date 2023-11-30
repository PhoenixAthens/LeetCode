package May_2023;
import java.util.*;
public class FindTheDifferenceBtwTwoArrays {
    //Runtime:3ms solution, Memory: 43.6MB
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int[] seen=new int[2005],seen2=new int[2005];
        for(int i:nums2){
            seen[i+1000]=1;
        }
        ArrayList<Integer> num1=new ArrayList<>();
        ArrayList<Integer> num2=new ArrayList<>();
        for(int i:nums1){
            if(seen[i+1000]==0){
                num1.add(i);
                seen[i+1000]=1;
            }
            seen2[i+1000]=1;
        }
        for(int i:nums2) {
            if (seen2[i + 1000] == 0) {
                num2.add(i);
                seen2[i+1000]=1;
            }
        }
        return Arrays.asList(num1,num2);

    }
    public static void main(String...args){
        System.out.println(new FindTheDifferenceBtwTwoArrays().findDifference(new int[]{1,2,3},new int[]{2,4,6}));
    }
}
