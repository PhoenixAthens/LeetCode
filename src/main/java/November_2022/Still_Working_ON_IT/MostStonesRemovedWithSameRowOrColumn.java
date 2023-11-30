package November_2022.Still_Working_ON_IT;

import java.util.*;

public class MostStonesRemovedWithSameRowOrColumn {
    //still working on it
    public static int removeStones(int[][] stones) {
        if(stones.length==1) return 0;
        else{
            int count=0;
            HashSet<int[]> setOF=new HashSet<>();
            for(int[] i:stones){
                if(!setOF.contains(i)){
                    setOF.add(i);
                    for(int[] j:stones){
                        if(!setOF.contains(j)){
                            if(i[0]==j[0] || i[1]==j[1]){
                                System.out.println(Arrays.toString(i)+" : "+Arrays.toString(j)+" : "+count);
                                count++;
                                break;
                            }
                        }
                    }
                }
            }
            return count;
        }
    }

    public static void main(String...args){
        System.out.println("First: "+removeStones(new int[][]{{0,1},{1,0},{1,1}}));
        //[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]
        //[[0,0],[0,2],[1,1],[2,0],[2,2]]
        int[][] arr=new int[][]{{0,0},{0,2},{1,1},{2,0},{2,2}};
        int[][] trr=new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
        System.out.println("Second: "+removeStones(arr));
        System.out.println("Third: "+removeStones(trr));
        //[[0,1],[1,2],[1,3],[3,3],[2,3],[0,2]] ->this broke the code!!

        //System.out.println(findMax(arr));



    }

        //[[0,0],
        //[0,1],
        //[1,0],
        //[1,2],
        //[2,1],
        //[2,2]]

}
