package March_2023;
import java.util.ArrayList;
//Date: 22nd March 2023
public class Number_Of_Zero_Filled_SubArrays {
    //Runtime: 12ms beats 5.64%, Memory: 62.6MB beats 12.54%
    public long zeroFilledSubarray(int[] nums) {
        long total=0;
        ArrayList<Integer> tempo=new ArrayList<>();
        for(int i:nums){
            if(i==0){
                tempo.add(i);
            }
            else if(tempo.size()>0){
                int size=tempo.size();
                while(size!=0){
                    total+=size;
                    size--;
                }
                tempo=new ArrayList<>();
            }
        }
        if(tempo.size()>0){
            int size=tempo.size();
            while(size!=0){
                total+=size;
                size--;
            }
        }
        return total;
    }
    public static void main(String...args){
        System.out.println(new Number_Of_Zero_Filled_SubArrays().zeroFilledSubarray(new int[]{1,3,0,0,2,0,0,4}));
        System.out.println(new Number_Of_Zero_Filled_SubArrays().zeroFilledSubarray(new int[]{0,0,0,2,0,0}));
    }
}
