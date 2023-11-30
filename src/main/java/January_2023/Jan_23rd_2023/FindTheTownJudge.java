package January_2023.Jan_23rd_2023;

public class FindTheTownJudge {
    //Runtime: 2ms beats 99%, Memory: 50.3MB beats 51.67%
    //Minor tweaks
    //Runtime: 2ms beats 99%, Memory: 49.7MB beats 89.14%
    public int findJudge(int n, int[][] trust) {
        int[] peeps=new int[n+1];
        peeps[0]=-100;
        for(int[] i:trust){
            peeps[i[0]]-=1;
            peeps[i[1]]+=1;
        }
        for(int i=0;i<peeps.length;i++)if(peeps[i]==n-1)return i;
        return -1;
    }
    public static void main(String...args){
        System.out.println(new FindTheTownJudge().findJudge(2,new int[][]{{1,2}}));
        System.out.println(new FindTheTownJudge().findJudge(3,new int[][]{{1,3},{2,3}}));
        System.out.println(new FindTheTownJudge().findJudge(3,new int[][]{{1,3},{2,3},{3,1}}));
        System.out.println(new FindTheTownJudge().findJudge(3,new int[][]{{1,2},{2,3}}));
        System.out.println(new FindTheTownJudge().findJudge(4,new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}}));
    }
}
