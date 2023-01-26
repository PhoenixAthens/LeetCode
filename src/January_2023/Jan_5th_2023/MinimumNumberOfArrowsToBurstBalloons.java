package January_2023.Jan_5th_2023;

public class MinimumNumberOfArrowsToBurstBalloons {
    //works for 21/49 test cases
    public int findMinArrowShots(int[][] points) {
        int count=0;
        int[] start=new int[points.length];
        int[] end=new int[points.length];
        for(int i=0;i<points.length;i++){
            boolean b=false;
            int[] p=points[i];
            for(int j=0;j<i;j++){
                //if((start[j]<=p[0] && p[0]<=end[j])||(start[j]<=p[1] && p[1]<=end[j])){
                if((start[j]<p[0] && p[0]<end[j]) || (start[j]<p[1] && p[1]<end[j]) || (start[j]==p[0] && p[1]==end[j])){
                    b=true;
                    break;
                }
            }
            if(!b){
                start[i]=p[0];
                end[i]=p[1];
                count++;
            }
        }
        return count;
    }
    public static void main(String...args){
        System.out.println(new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}));
        System.out.println(new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{1,2},{3,4},{5,6},{7,8}}));
        System.out.println(new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{1,2},{2,3},{3,4},{4,5}}));
    }
    //[[3,9],[7,12],[3,8],[6,8],[9,10],[2,9],[0,9],[3,9],[0,6],[2,8]]
    //output 1, expected 2

    /*
        HashSet<Integer> range=new HashSet<>();
        for(int[] i:points){
            int[] check={0};
            range.forEach(x->{if(i[0]==x || x==i[1]){
                check[0]=1;
            }
            });
            //System.out.println(check[0]);
            if(check[0]==0)count++;
            else check[0]=0;
            for(int j=i[0];j<=i[1];j++)range.add(j);
            //System.out.println(range);
    * */

}
