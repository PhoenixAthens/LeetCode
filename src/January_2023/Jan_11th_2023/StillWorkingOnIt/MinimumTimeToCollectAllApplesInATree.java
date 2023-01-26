package January_2023.Jan_11th_2023.StillWorkingOnIt;
import java.util.*;
public class MinimumTimeToCollectAllApplesInATree {
    //still working on it!!
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        if(!hasApple.contains(true))return 0;
        else{
            boolean[] arr=new boolean[n];
            for(int i=0;i<n;i++){
                arr[i]=hasApple.get(i);
            }
            HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
            for(int[] edge:edges){
                if(map.containsKey(edge[0])){
                    map.get(edge[0]).add(edge[1]);
                }else{
                    map.put(edge[0],new ArrayList<>(List.of(edge[1])));
                }
            }
            return digger(map,0,arr,0);
        }

    }
    public int digger(HashMap<Integer,ArrayList<Integer>> map,int key, boolean[] check,int time){
        int t=time;
        ArrayList<Integer> get=map.get(key);
        for(int i:get){
            if(check[i]){
                t+=2;
            }
            if(map.containsKey(i))t+=digger(map,i,check,t+=2);
        }
        return t;
    }
}
