package From_November_29th;

import java.util.*;

public class RandomizedSet_SecondIteration {
    //Time: 431ms, Memory:112.2MB
    private final HashSet<Integer> numbers;
    public RandomizedSet_SecondIteration(){
        numbers=new HashSet<Integer>();
    }
    public boolean insert(int val){
        return numbers.add(val);
    }
    public boolean remove(int val){
        return numbers.remove(val);
    }
    public int getRandom() {
        int start=0;
        int got=0;
        int find=(int)(Math.random()*numbers.size());
        for (int i : numbers) {
            if(find==start){
                got=i;
                break;
            }
            start++;

        }
        return got;
    }
}
