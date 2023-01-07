package JAN_7_2023;

public class PossibleBipartition {
    //works for 37/73 test cases
    //try using a Map
    //problem with the MAp approach: how do you check the correctness of a relation? Like 2:[1,4], 2:[4,1], sort of situation
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] LoveList=new int[n+1];
        for(int i=1;i<=n;i++)LoveList[i]=n-1;
        LoveList[0]=100;
        for(int[] i:dislikes){
            LoveList[i[0]]--;
            LoveList[i[1]]--;
        }
        for(int i:LoveList){
            if(i==0)return false;
        }
        return true;
    }
    public static void main(String...args){
        System.out.println(new PossibleBipartition().possibleBipartition(4,new int[][]{{1,2},{1,3},{2,4}}));
        System.out.println(new PossibleBipartition().possibleBipartition(3,new int[][]{{1,2},{1,3},{2,3}}));
    }
}
