package January_2023.Jan_25th_2023;
import java.lang.reflect.Array;
import java.util.*;
public class FindClosestNodeToGivenTwoNodes {
    //works for 62/77 test cases so far!
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        if(node1==node2)return node2;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            ArrayList<Integer> temp=map.getOrDefault(i,new ArrayList<>());
            if(temp.size()==0) {
                map.put(i, temp);
            }
            temp.add(i);
            temp.add(edges[i]);
        }
        //System.out.println(map);
        // The code below results in Exceeding Time Limit!
        ArrayList<Integer> allConnectionsOfNode1=reach(map,node1);
        /*System.out.println(allConnectionsOfNode1);
        ArrayList<Integer> allConnectionsOfNode2=reach(map,node2);
        System.out.println(allConnectionsOfNode2);
        int dist=Integer.MAX_VALUE;
        int node=-1;
        for(int i=0;i<allConnectionsOfNode1.size();i++){
            int element=allConnectionsOfNode1.get(i);
            if(allConnectionsOfNode2.contains(element)){
                int tempDist=Math.max(i,allConnectionsOfNode2.indexOf(element));
                if(tempDist<dist){
                    dist=tempDist;
                    node=element;
                }else if(tempDist==dist && element<node){
                    node=element;
                }
            }
        }*/
        return secondList(map,node2,allConnectionsOfNode1);
    }
    public ArrayList<Integer> reach(HashMap<Integer,ArrayList<Integer>> map, int node){
        ArrayList<Integer> make=new ArrayList<>();
        make.add(node);
        while(node!=-1){
            int val=map.get(node).get(1);
            node=val;
            if(make.contains(val))break;
            if(val!=-1)make.add(val);
        }
        return make;
    }
    public int secondList(HashMap<Integer,ArrayList<Integer>> map, int node2, ArrayList<Integer> fromNode1){
        int dist=2_000_000_000;
        int node=-1;
        int i=0;
        int tempVal=map.get(node2).get(0);
        if(fromNode1.contains(tempVal)){
            int tempDist=Math.max(i,fromNode1.indexOf(tempVal));
            if(tempDist<dist){
                dist=tempDist;
                node=tempVal;
            }
        }
        ArrayList<Integer> make=new ArrayList<>();
        make.add(tempVal);
        while(node2!=-1){
            int val=map.get(node2).get(1);
            node2=val;
            if(make.contains(val))break;
            if(val!=-1){
                i++;
                make.add(val);
            }
            if(fromNode1.contains(val)){
                int tempDist=Math.max(i,fromNode1.indexOf(val));
                if(tempDist<dist){
                        dist=tempDist;
                        node=val;
                }else if(tempDist==dist && val<node){
                        node=val;
                }
            }
        }
        return node;
    }
    /*public int result(HashMap<Integer,ArrayList<Integer>> map, int node1, int node2){
        ArrayList<Integer> mk=new ArrayList<>();
        mk.add(node1);
        int len=0;
        while(true){
            int val=map.get(node1).get(1);
            node1=val;
            if(val!=-1)make.add(val);
        }
    }*/
    public static void main(String...args){
        System.out.println(new FindClosestNodeToGivenTwoNodes().closestMeetingNode(new int[]{2,2,3,-1},0,1));
        System.out.println(new FindClosestNodeToGivenTwoNodes().closestMeetingNode(new int[]{1,2,-1},0,2));
        System.out.println(new FindClosestNodeToGivenTwoNodes().closestMeetingNode(new int[]{9,8,7,0,5,6,1,3,2,2},1,6));
        System.out.println(new FindClosestNodeToGivenTwoNodes().closestMeetingNode(new int[]{2,0,0},2,0));
        System.out.println(new FindClosestNodeToGivenTwoNodes().closestMeetingNode(new int[]{4,4,8,-1,9,8,4,4,1,1},5,6));
    }
    // 22101
}
