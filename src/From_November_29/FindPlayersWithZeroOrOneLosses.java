package From_November_29;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.ArrayList;
public class FindPlayersWithZeroOrOneLosses {
    //Time: 142ms beats 78.35%, Memory:109.1MB beats 82.1%
    public static List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> record=new HashMap<>();
        Arrays.stream(matches).forEach(x->{
            record.put(x[0],0);
            record.put(x[1],0);
        });
        for(int i=0;i<matches.length;i++){
            int presentKey=matches[i][1];
            if(record.containsKey(presentKey)){
                record.put(presentKey,record.get(presentKey)+1);
            }
        }
        TreeSet<Integer> set1=new TreeSet<>();
        TreeSet<Integer> set2=new TreeSet<>();
        record.forEach((x,y)->{
            if(y==0){
                set1.add(x);
            }else if(y==1){
                set2.add(x);
            }
        });

        List<List<Integer>> make=new ArrayList<>();
        make.add(new ArrayList<>(set1));
        make.add(new ArrayList<>(set2));
        return make;
    }
    public static void main(String...args){
        System.out.println(findWinners(new int[][]{{1,3},{2,3},{5,4},{6,4}/*,{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}*/}));
    }
}
