package October_2022.Still_Working_On_IT;

import java.util.*;
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> main=new ArrayList<>();
        List<Integer> inner=new ArrayList<>();
        if(k==1){
            for(int i=1;i<=n;i++){
                inner.add(i);
                main.add(inner);
                inner=new ArrayList<>();
            }
            return main;
        }
        ArrayList<Integer> tempArray=new ArrayList<>();
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++ ){
                tempArray.add(i);
                tempArray.add(j);
            }
        }
        System.out.println(tempArray);
        for (Integer integer : tempArray) {
            inner.add(integer);
            if(inner.size()==k){
                main.add(inner);
                inner=new ArrayList<>();
            }
        }
        return main;
        //12 13 14 23 24 34 n=4, total vals=1-4, if n=5 then 12 13 14 15, 23 24 25 34 35 45 n=6, 12 13 14 15 16, 23 24 25 26, 34 35 36, 45 46, 56
        // 4=6, 5=10, 6=15
    }
    public static void main(String...args){
        System.out.println(combine(4,2));
    }
}
