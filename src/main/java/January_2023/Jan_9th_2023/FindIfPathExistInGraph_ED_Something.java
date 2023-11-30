package January_2023.Jan_9th_2023;
import java.util.ArrayList;
public class FindIfPathExistInGraph_ED_Something {
    //brute force, works for 27/28 test cases
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)return true;
        ArrayList<Integer> listOfSources=new ArrayList<>();
        for(int[] i:edges){
            if(i[0]==source || listOfSources.contains(i[0])){
                source=i[1];
                listOfSources.add(i[0]);
                listOfSources.add(i[1]);
            }else if(i[1]==source || listOfSources.contains(i[1])){
                source=i[0];
                listOfSources.add(i[0]);
                listOfSources.add(i[1]);
            }

        }
        return listOfSources.contains(destination);
    }
}
