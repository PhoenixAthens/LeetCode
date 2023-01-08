package JAN_8_2023;
import java.util.*;
public class MaxPointsOnALine_ED1 {
    //works for 22/35 test cases
    public int maxPoints(int[][] points) {
        if(points.length==1 || points.length==2 )return points.length;
        else{
            HashMap<Double,HashSet<int[]>> map=new HashMap<>();
            for (int[] present : points) {
                for (int[] point : points) {
                    if(Arrays.equals(point,present))continue;
                    if(present[0] - point[0]!=0){
                        double a=point[1] - present[1];
                        double b=point[0] - present[0];
                        double slope =(a/b);
                        if(slope==0)continue;
                        if (map.containsKey(slope)) {
                            HashSet<int[]> foul = map.get(slope);
                            foul.add(present);
                            foul.add(point);
                        } else map.put(slope, new HashSet<>(List.of(point, present)));
                    }
                }
            }
            //remove this later
            for(double i:map.keySet()){
                System.out.println("Slope: "+i);
                for(int[] j:map.get(i)){
                    System.out.println(Arrays.toString(j));
                }
            }
            //till here
            if(map.keySet().size()==0)return points.length;
            int max=0;
            for(double i:map.keySet()){
                int s=map.get(i).size();
                max=Math.max(s,max);
            }
            return max;
        }

    }
    public static void main(String...args){
        /*HashSet<int[]> check=new HashSet<>();
        int[] how=new int[]{1,2};
        check.add(how);
        check.add(how);
        System.out.println(check);*/
//        System.out.println(new MaxPointsOnALine_ED1().maxPoints(new int[][]{{1,1},{2,2},{3,3}}));
//        System.out.println(new MaxPointsOnALine_ED1().maxPoints(new int[][]{{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}}));
//        System.out.println(new MaxPointsOnALine_ED1().maxPoints(new int[][]{{1,1},{2,2}}));
//        System.out.println(new MaxPointsOnALine_ED1().maxPoints(new int[][]{{1,1}}));
//        System.out.println(new MaxPointsOnALine_ED1().maxPoints(new int[][]{{0,1},{0,0}}));
//        System.out.println(new MaxPointsOnALine_ED1().maxPoints(new int[][]{{9,-25},{-4,1},{-1,5},{-7,7}}));
        //[[0,0],[4,5],[7,8],[8,9],[5,6],[3,4],[1,1]]
        System.out.println(new MaxPointsOnALine_ED1().maxPoints(new int[][]{{0,0},{4,5},{7,8},{8,9},{5,6},{3,4},{1,1}}));
        //present={9,-25}
        //Working:
        // (1-(-25))/(-4-9)=26/13=2
        // (5-(-25))/(-1-9)=30/-10=3
        // (7-(-25))/(-7-9)=32/-16=2
        //
    }
}
