package July_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ImplementingDFS {
    public static void GeneralDFS(HashMap<Integer, int[]> adjacencyList){
        //This array keeps record of vertices that have so far been visited!
        int[] recordKeeper = new int[adjacencyList.size()];
        int[] EdgeOrderKeeper = {0};
        ArrayList<String> TreeEdges = new ArrayList<>();
        for(int i : adjacencyList.keySet()){
            if(recordKeeper[i-1]==0){
                DFS_visit(i, recordKeeper, TreeEdges, EdgeOrderKeeper, adjacencyList);
            }
        }
        System.out.println(TreeEdges);
        System.out.println(Arrays.toString(recordKeeper));
        System.out.println(Arrays.toString(EdgeOrderKeeper));

    }
    public static void DFS_visit(int edge, int[] recordKeeper, ArrayList<String> listOfTreeEdges, int[] edgeNum, HashMap<Integer,int[]> adjList){
        edgeNum[0]++;
        recordKeeper[edge-1]=edgeNum[0];
        for(int i: adjList.get(edge)){
            if(recordKeeper[i-1]==0){
                listOfTreeEdges.add(edge+"."+i);
                DFS_visit(i,recordKeeper,listOfTreeEdges,edgeNum,adjList);
            }
        }
    }
    public static void main(String...args){
        ArrayList<String> keeper= new ArrayList<>();
        keeper.add("1_2");
        System.out.println(keeper.contains("1_2")); //true
        HashMap<Integer,int[]> graph=new HashMap<>();
        graph.put(1, new int[]{2,3});
        graph.put(2, new int[]{1,4,5});
        graph.put(3, new int[]{1,6});
        graph.put(4, new int[]{2});
        graph.put(5, new int[]{2,6});
        graph.put(6, new int[]{3,5});
        GeneralDFS(graph);
        // Output
        /*
        [1.2, 2.4, 2.5, 5.6, 6.3]
        [1, 2, 6, 3, 4, 5]
        [6]
        */


        /*
        G = {
            'A': ['B', 'C'],          = 1,{2,3}
            'B': ['A', 'D', 'E'],     = 2,{1,4,5}
            'C': ['A', 'F'],          = 3,{1,6}
            'D': ['B'],               = 4,{2}
            'E': ['B', 'F'],          = 5,{2,6}
            'F': ['C', 'E']           = 6,{3,5}
        }
        */

    }
}
