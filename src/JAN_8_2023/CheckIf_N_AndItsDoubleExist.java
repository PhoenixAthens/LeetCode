package JAN_8_2023;
import java.util.*;
public class CheckIf_N_AndItsDoubleExist {
    //Runtime:2ms beats 76.39%, Memory: 41.7MB beats 86.88%
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> make=new ArrayList<>();
        for(int i:arr){
            if(i%2==0){
                if(make.contains(i*2)||make.contains(i/2))return true;
            }else{
                if(make.contains(i*2))return true;
            }
            make.add(i);
        }
        return false;
    }
}
