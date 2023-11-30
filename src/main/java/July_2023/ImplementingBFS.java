package July_2023;

import java.util.*;

public class ImplementingBFS {
    public void BFS(HashMap<Integer,int[]> adjacencyList, int startingVertex){
        int[] visited = new int[adjacencyList.size()];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<String> edgesTraversed = new ArrayList<>();
        visited[startingVertex-1]+=1;
        queue.offer(startingVertex);
        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            for(int i:adjacencyList.get(currentVertex)){
                if(visited[i-1]==0){
                    visited[i-1]+=1;
                    queue.offer(i);
                    edgesTraversed.add(currentVertex+"."+i);
                }
            }
        }
        System.out.println(edgesTraversed);
    }
    public HashMap<Integer, int[]> adjacencyListGenerator(int edges){
        HashMap<Integer,int[]> adjList = new HashMap<>();
        for(int i=0;i<edges;i++){
            int lengthOfAdjList = (int)(Math.random()*edges);
            int[] arr = new int[lengthOfAdjList];
            for(int j=0;j<lengthOfAdjList;j++){
                var num = (int)(Math.random()*edges);
                if(num!=j)arr[j]=num;
            }
            adjList.put(i,arr);
        }
        return adjList;
    }
    public static void main(String[] args){
        HashMap<Integer,int[]> graph=new HashMap<>();
        graph.put(1, new int[]{2,3});
        graph.put(2, new int[]{1,4,5});
        graph.put(3, new int[]{1,6});
        graph.put(4, new int[]{2});
        graph.put(5, new int[]{2,6});
        graph.put(6, new int[]{3,5});
        new ImplementingBFS().BFS(graph,4); //[4.2, 2.1, 2.5, 1.3, 5.6]
        var testMAP = new ImplementingBFS().adjacencyListGenerator(6);
        for(int i:testMAP.keySet()){
            System.out.println(i+"->"+Arrays.toString(testMAP.get(i)));
        }
        /*
        *
        * 0->[1, 5]
          1->[0, 3, 0, 5] //To prevent this we need a Set data structure
          2->[]
          3->[3, 2, 1, 1, 5]
          4->[5]
          5->[3]

        *
        *
        *
        *
        *
        * */

    }
}
