package April_2023;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
//Date: April 4th 2023
public class Find_Closest_Node_To_Given_Two_Nodes {
    //Runtime: 16ms beats 78.88%, Memory: 59.9MB beats 59.94%
    public void bfs(int startNode, int[] edges, int[] dist){
        int n = edges.length;
        Queue<Integer> qu=new ArrayDeque<>();
        qu.offer(startNode);
        dist[startNode] = 0;
        //we have this boolean array to avoid going in circles
        boolean[] visited=new boolean[n];
        while(!qu.isEmpty()){
            int presentNode = qu.poll();
            if(visited[presentNode])continue;
            visited[presentNode]=true;
            int neighbor = edges[presentNode];
            if(neighbor!=-1 && !visited[neighbor]){
                dist[neighbor]=dist[presentNode]+1;
                qu.offer(neighbor);
            }
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n= edges.length;
        int[] dist1=new int[n],dist2=new int[n];
        Arrays.fill(dist1,-27);
        Arrays.fill(dist2,-27);
        bfs(node1,edges,dist1);
        bfs(node2,edges,dist2);
        int minDistNode = -1;
        int minDist = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(dist1[i]!=-27 && dist2[i]!=-27)continue;
            int tempMinDist = Math.max(dist1[i],dist2[i]);
            if(tempMinDist<minDist){
                minDistNode=i;
                minDist=tempMinDist;
            }
        }
        return minDistNode;
    }
    public static void main(String...args){
        System.out.println(new Find_Closest_Node_To_Given_Two_Nodes().closestMeetingNode(new int[]{2,2,3,-1},0,1));
        System.out.println(new Find_Closest_Node_To_Given_Two_Nodes().closestMeetingNode(new int[]{1,2,-1},0,2));
    }
}
