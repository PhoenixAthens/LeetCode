package Scrap;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class TestForMonotonicIncrease {
    public static void main(String...args){
        int[] array=new int[]{0,3,4,5,2,3,4,1,4};
        ArrayList<Integer> breaks=new ArrayList<>();
        for(int i=1;i<array.length-1;i++){
            if(i>i-1 && array[i]>array[i-1]){
                continue;
            }else{
                breaks.add(i);
            }
        }
        System.out.println(breaks);
        java.util.Arrays.stream(array).forEach(TestForMonotonicIncrease::accept);

    }

    private static void accept(int x) {
        System.out.println(x - 100);
    }
}
