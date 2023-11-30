package Scrap;
import java.util.*;

import static com.sun.tools.attach.VirtualMachine.list;

public class TestingToArray {
    public static void main(String...args){
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,9));
        Integer[] arrayOfInts=arr.toArray(new Integer[arr.size()]);
        System.out.println(Arrays.toString(arrayOfInts));
        Iterator it=list().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
