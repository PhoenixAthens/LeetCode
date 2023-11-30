package January_2023.Jan_15th_2023;
import java.util.*;



public class FindAllNumbersDisappearedInAnArray {
    //Runtime: 3ms beats 99.84%, Memory: 50.3MB beats 84.90%
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] make2=new int[nums.length];
        for(int i:nums){
            make2[i-1]=-2903;
        }
        ArrayList<Integer> vales=new ArrayList<>();
        for(int i=0;i<make2.length;i++)if(make2[i]!=-2903)vales.add(i+1);
        return vales;
    }
    public static void main(String...args){
        System.out.println(new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{1,1}));

    }
}
