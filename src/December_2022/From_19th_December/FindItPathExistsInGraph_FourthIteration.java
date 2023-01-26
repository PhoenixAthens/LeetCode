package December_2022.From_19th_December;
import java.util.*;
public class FindItPathExistsInGraph_FourthIteration {
    private boolean state=false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)return true;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int[] am:edges){
            int first=am[0];
            int second=am[1];
            if(first==source && second==destination)return true;
            if(map.containsKey(first)) map.get(first).add(second);
            else map.put(first,new ArrayList<>(List.of(second)));
            if(map.containsKey(second)) map.get(second).add(first);
            else map.put(second,new ArrayList<>(List.of(first)));
        }
        System.out.println(map);
        ArrayList<Integer> prev=new ArrayList<>();
        recur(map,source,destination,prev);
        return state;
    }
    public void recur(HashMap<Integer,List<Integer>> map,int source,int destiny,ArrayList<Integer>prev){
        if(!prev.contains(source)){
            List<Integer> got=map.get(source);
            if(got.contains(destiny))state=true;
            for(int i=0;i<got.size();i++){

                recur(map,got.get(i),destiny,prev);
                prev.add(got.get(i));
            }
        }

    }
    public static void main(String...args){
        System.out.println(new FindItPathExistsInGraph_FourthIteration().validPath(3,new int[][]{{0,1},{1,2},{2,0}},0,2));
        System.out.println(new FindItPathExistsInGraph_FourthIteration().validPath(6,new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}},0,5));
    }
}
