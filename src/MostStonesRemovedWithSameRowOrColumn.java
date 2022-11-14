import java.util.*;

public class MostStonesRemovedWithSameRowOrColumn {
    //still working on it
    public static int removeStones(int[][] stones) {
        if(stones.length==1) return 0;
        else{
            HashSet<int[]> setOF=new HashSet<>();
            int counter=0;
            int k=0;
            while(k<stones.length){
                int[] present=stones[k];
                if(!setOF.contains(present)){
                    setOF.add(present);
                    for(int j=0;j<stones.length;j++){
                        if(!setOF.contains(stones[j])){
                            if(stones[j][0]==present[0]||stones[j][1]==present[1]){
                                counter++;
                                present=stones[j];
                                j=0;
                                setOF.add(present);
                            }
                        }
                    }
                }
                k++;
            }
            return counter;
        }
    }
    /*public static int findMax(int[][] ints){
        if(ints.length==1) return 0;
        else{
            int[] arr=new int[ints.length];
            for(int i=0;i<arr.length;i++){
                arr[i]=ints[i][0]*10+ints[i][1];
            }
            int k=0;
            Arrays.parallelSort(arr);
            int counter=0;
            for(int i= arr.length-1;i>=0;i--){
                k=i-1;
                int present=arr[i];
                for(;k>=0;k--){
                    if(arr[k]%10==present%10 || arr[k]/10==present/10){
                        counter++;
                        break;
                    }
                }
            }
            return counter;
        }
    }*/
    public static void main(String...args){
        System.out.println(removeStones(new int[][]{{0,1},{1,0},{1,1}}));
        //[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]
        //[[0,0],[0,2],[1,1],[2,0],[2,2]]
        int[][] arr=new int[][]{{0,0},{0,2},{1,1},{2,0},{2,2}};
        //System.out.println(findMax(arr));



    }

        //[[0,0],
        //[0,1],
        //[1,0],
        //[1,2],
        //[2,1],
        //[2,2]]

}
