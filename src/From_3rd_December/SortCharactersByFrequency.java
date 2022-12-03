package From_3rd_December;
import java.util.TreeMap;
import java.util.ArrayList;
public class SortCharactersByFrequency {
    //RUNTIME: 153ms beats 19.48%, Memory:57.4MB beats 57.4%
    public String frequencySort(String s) {
        TreeMap<String,Integer> counter=new TreeMap<>(); //using HashMap reduces runtime to 118ms
        for(String i:s.split("")){
            if(counter.containsKey(i)){
                counter.put(i,counter.get(i)+1);
            }else{
                counter.put(i,1);
            }
        }
        ArrayList<String> sorter=new ArrayList(counter.keySet());
        sorter.sort((x,y)->counter.get(y)-counter.get(x));
        StringBuilder build=new StringBuilder();
        for(String i:sorter){
            build.append(i.repeat(counter.get(i)));
        }
        return build.toString();
    }
    public static void main(String...args){
        System.out.println(new SortCharactersByFrequency().frequencySort("raaeaedere"));
    }
}
