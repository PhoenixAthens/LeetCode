package September_2023;
import java.util.HashMap;
public class Checking_Existence_Of_Edge_Length_Limited_Paths {
    //Work in progress, need a sheaf of papers to solve this one
    //problem 1697
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        HashMap<Integer,Integer>[] locator = new HashMap[n];
        for(int[] i:edgeList){
            if(locator[i[0]] == null){
                locator[i[0]]=new HashMap<>();
            }else if(locator[i[1]] == null){
                locator[i[1]]=new HashMap<>();
            }
            locator[i[0]].put(i[1],i[2]);
            locator[i[1]].put(i[0],i[2]);
        }
        boolean[] result = new boolean[queries.length];
        int index = 0;
        for(int[] arr  : queries){
            // int start = arr[0];
            // int end = arr[1];
            boolean[] visited = new boolean[n];
            HashMap<Integer,Integer> fromStart = locator[arr[0]];
            HashMap<Integer,Integer> current = fromStart;
            for(int i: fromStart.keySet()){
               /* while(current){
                    if(!visited[i]){
                        current = locator[i];
                    }
                }*/



            }
            if(result[index]==false){
                visited = new boolean[n];
                HashMap<Integer,Integer> fromEnd = locator[arr[0]];
                for(int i: fromStart.keySet()){

                }
            }
        }
        return null;
    }
}
