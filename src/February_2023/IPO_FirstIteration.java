package February_2023;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IPO_FirstIteration {
    //works for 22/35 test cases!
    //Improvements:
    //works for 31/35 test cases!
    //Improvement:
    //works for 32/35 test cases
    //Time limit exceeds at 33rd test case!!
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        HashMap<Integer, ArrayList<Integer>> record=new HashMap<>();
        for(int i=0;i<profits.length;i++){
            if(record.containsKey(capital[i]))
                record.get(capital[i]).add(profits[i]);
            else
                record.put(capital[i],new ArrayList<>(List.of(profits[i])));
        }
        System.out.println(record);
        while(k!=0){
            int tempW=w;
            int maxProfit=0;
            int foundAtKey=-1001;
            int keyValue=-1001;
            for(int i:record.keySet()){
                if(i<=w){
                    ArrayList<Integer> present=record.get(i);
                    for(int j=0;j<present.size();j++){
                        if(present.get(j)>=maxProfit){
                            maxProfit=present.get(j);
                            keyValue=j;
                            tempW=i;
                            foundAtKey=i;
                        }
                    }
                }
            }
            if(foundAtKey==-1001 || keyValue==-1001)break;
            w+=maxProfit;
            k--;
            ArrayList<Integer> thisTime=record.get(foundAtKey);
            if(thisTime.size()==1){
                record.remove(foundAtKey);
            }else{
                thisTime.set(keyValue,-1001);
            }
        }
        return w;
    }
    public static void main(String...args){
        var value=new IPO_FirstIteration().findMaximizedCapital(2,0,new int[]{1,2,3},new int[]{0,1,1});
        System.out.println(value);
        var value2=new IPO_FirstIteration().findMaximizedCapital(3,0,new int[]{1,2,3},new int[]{0,1,2});
        System.out.println(value2);
        var value3=new IPO_FirstIteration().findMaximizedCapital(11,11, new int[]{1,2,3}, new int[]{11,12,13});
        System.out.println(value3);
        //var value4=new IPO_FirstIteration().findMaximizedCapital(111,12)
    }
}
