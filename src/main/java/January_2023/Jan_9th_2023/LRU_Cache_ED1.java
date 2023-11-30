package January_2023.Jan_9th_2023;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
public class LRU_Cache_ED1 {
    //works for 12/22 test cases
    //still working on it!!
    //More importantly, trying to understand the logic behind the DS
    private final HashMap<Integer,Integer> map;
    private int HighCap;
    Deque<Integer> deque=new ArrayDeque<>();
    public LRU_Cache_ED1(int capacity) {
        map=new HashMap<>();
        HighCap=capacity;
    }

    public int get(int key) {
        return map.get(key)==null?-1:map.get(key);
    }

    public void put(int key, int value) {
        if(map.size()==HighCap){
            map.remove(deque.pop());
            map.put(key,value);
        }else{
            deque.push(key);
            map.put(key,value);
        }
    }
}
