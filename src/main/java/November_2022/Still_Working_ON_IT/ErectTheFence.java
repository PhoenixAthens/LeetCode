package November_2022.Still_Working_ON_IT;

import java.util.HashSet;
import java.util.Arrays;
public class ErectTheFence {
    public static int[][] outerTrees(int[][] trees) {
        HashSet<int[]> found=new HashSet<>();
        int prev=trees[0][1];
        int count=1;
        for(int i=1;i<trees.length;i++){
            if(trees[i][1]==prev){
                count++;
            }
        }
        if(count==trees.length){
            return trees;
        }else{
            boolean flag=false;
            for(int i=trees.length-1;i>=0;i--){
                int[] present=trees[i];
                for(int j=0;j<trees.length;j++) {
                    if(present[0]==0){
                        break;
                    }else if(trees[j][1]==present[1] && trees[j][0]>present[0])
                        flag=true;
                }
                if(!flag){
                    found.add(present);
                }else{
                    flag=false;
                }
            }
            return found.toArray(new int[found.size()][2]);
        }
    }
    public static void main(String...args){
        int[][] dude=outerTrees(new int[][]{{0,2},{1,1},{2,2},{2,4},{4,2},{3,3}});
        for(int i=0;i<dude.length;i++){
            System.out.println(Arrays.toString(dude[i]));
        }
    }
}
