package April_2023;
import java.util.Arrays;
public class ClosestNodeToTwoGivenNodes_DFS {
    //Runtime: 26ms beats 46.26%, Memory: 65.4MB beats 28.83%
    //Minor tweaks
    //Runtime: 22ms beats 62.99%, Memory: 65.5MB beats 28.83%
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] dist1=new int[edges.length], dist2 = new int[edges.length];
        boolean[] visit1=new boolean[edges.length], visit2 = new boolean[edges.length];
        for(int i=0;i<edges.length;i++){
            dist1[i]=-27;
            dist2[i]=-27;
        }
        dist1[node1]=0;
        dist2[node2]=0;
        dfs(dist1,visit1,edges,node1);
        dfs(dist2,visit2,edges,node2);
        int currentResult=-1;
        int maxTempTillNow=Integer.MAX_VALUE;
        for(int i=0;i<edges.length;i++){
            if(dist1[i]==-27||dist2[i]==-27)continue;
            int temp=Math.max(dist1[i],dist2[i]);
            if(temp<maxTempTillNow){
                currentResult=i;
                maxTempTillNow=temp;
            }
        }
        return currentResult;
    }
    public void dfs(int[] dist, boolean[] visitor, int[] edges, int currNode ){
        if(!visitor[currNode]){
            visitor[currNode]=true;
            int neighbor = edges[currNode];
            if(neighbor!=-1 && !visitor[neighbor]){
                dist[neighbor]=1+dist[currNode];
                dfs(dist,visitor,edges,neighbor);
            }
        }
    }
}
