package December_2022.From_19th_December;
import java.util.*;
public class FindIfPathExistsInGraph_ThirdIteration {
    private static boolean flag=false;
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        int len=edges.length;
        HashMap<Integer,ArrayList<Integer>> mapCreate=new HashMap<>();
        if (len == 0) return source == destination;
        for (int i = 0; i < len; i++) {
            int presentSource=edges[i][0];
            int presentDestination=edges[i][1];
            if ((presentSource == source && presentDestination == destination) || (presentSource == destination && presentDestination == source)) {
                return true;
            }
            if(mapCreate.containsKey(presentSource))mapCreate.get(presentSource).add(presentDestination);
            else mapCreate.put(presentSource,new ArrayList<>(List.of(presentDestination)));
        }
        System.out.println(mapCreate);
        for(int i:mapCreate.keySet()){
            recur(mapCreate,source,destination);
        }

        //recur(mapCreate,destination,source);
        return flag;
        // we use recursion
        //in a map
    }
    public static void recur(HashMap<Integer,ArrayList<Integer>> map,int source,int destination){
        System.out.println(source+":"+destination+":"+flag);
        if(source==destination)flag=true;
        else if(map.containsKey(source)){
            ArrayList<Integer> present=map.get(source);
            if(present.size()==1){
                recur(map,present.get(0),destination);
            }else{
                for(int i=0;i<present.size();i++){
                    recur(map,present.get(i),destination);
                }
            }
        }
    }
    public static void main(String...args){
        var gpt=validPath(10,new int[][]{{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,9},{5,4}},5,9);
        System.out.println(gpt);
        flag=false;
        var ppt=validPath(6,new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}},0,5);
        System.out.println(ppt);

    }
}
