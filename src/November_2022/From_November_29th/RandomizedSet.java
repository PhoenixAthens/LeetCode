package November_2022.From_November_29th;
import java.util.ArrayList;
//Problem Name: Insert Delete GetRandom O(1)
public class RandomizedSet {
    //Time: 290ms, Memory:113.1MB
    private final ArrayList<Integer> numbers;
    public RandomizedSet(){
        numbers=new ArrayList<Integer>();
    }
    public boolean insert(int val){
        if(!numbers.contains(val)){
            return numbers.add(val);
        }
        return false;
    }
    public boolean remove(int val){
        int index=numbers.indexOf(val);
        if(index!=-1){
            numbers.remove(index);
            return true;
        }
        return false;
    }
    public int getRandom(){
        return numbers.get(((int)(Math.random()* numbers.size())));
    }

}
