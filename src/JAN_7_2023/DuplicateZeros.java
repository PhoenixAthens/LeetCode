package JAN_7_2023;
import java.util.*;
public class DuplicateZeros {
    //Runtime:2ms beats 78.63%, Memory: 43.5MB beats 59.51%
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> create=new ArrayList<>();
        for(int i=0;create.size()<arr.length;i++){
            if(arr[i]==0){
                create.add(0);
                create.add(0);
            }
            else create.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=create.get(i);
        }
    }
}
