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
    public static HashMap<Integer,ArrayList<int[]>> connectedComponents(HashMap<Integer,ArrayList<Integer>> adjMatrix){
        int numOfNodes = adjMatrix.size();
        int[] visited = new int[numOfNodes];
        int[] connectedComponents= new int[numOfNodes];
        int[] compNum ={0};
        HashMap<Integer,ArrayList<int[]>> componentCollector = new HashMap<>();
        for(int i:adjMatrix.keySet()){
            if(visited[i-1]==0 && connectedComponents[i-1]==0){
                visited[i-1]++;
                compNum[0]++;
                ArrayList<int[]> edgeCollector = new ArrayList<>();
                DOJ(i,adjMatrix,compNum,connectedComponents,visited, edgeCollector);
                if(edgeCollector.isEmpty()){
                    componentCollector.put(compNum[0],new ArrayList<>(Arrays.asList(new int[]{i})));
                }else{
                    componentCollector.put(compNum[0],edgeCollector);
                }

            }
        }
        return componentCollector;
    }
    public static void DOJ(int edge, HashMap<Integer,ArrayList<Integer>> adjMatrix, int[] compNum,
                                                        int[] connectedComponents, int[] visited, ArrayList<int[]> edgeCollector){

        for(int i: adjMatrix.get(edge)){
            if(visited[i-1]==0){
                edgeCollector.add(new int[]{edge,i});
                visited[i-1]++;
                connectedComponents[i-1]=compNum[0];
                DOJ(i,adjMatrix,compNum,connectedComponents,visited,edgeCollector);
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
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        adjList.put(1, new ArrayList<>(Arrays.asList(2, 3)));
        adjList.put(2, new ArrayList<>(Arrays.asList(1, 3)));
        adjList.put(3, new ArrayList<>(Arrays.asList(1, 2)));
        adjList.put(4, new ArrayList<>(Arrays.asList(5)));
        adjList.put(5, new ArrayList<>(Arrays.asList(4)));
        adjList.put(6, new ArrayList<>(Arrays.asList()));
        adjList.put(7, new ArrayList<>(Arrays.asList(8, 9)));
        adjList.put(8, new ArrayList<>(Arrays.asList(7, 9)));
        adjList.put(9, new ArrayList<>(Arrays.asList(7, 8)));
        adjList.put(10, new ArrayList<>(Arrays.asList()));
        var result_1 = connectedComponents(adjList);
        for(int i:result_1.keySet()){
            System.out.print(i + "->");
            for(int[] j:result_1.get(i)){
                System.out.print(Arrays.toString(j)+", ");
            }
            System.out.println();

        }
        /*
        1->[1, 2], [2, 3],
        2->[4, 5],
        3->[6],
        4->[7, 8], [8, 9],
        5->[10],
        */

    }
}
