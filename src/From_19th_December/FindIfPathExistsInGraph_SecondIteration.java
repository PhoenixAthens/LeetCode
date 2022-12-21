package From_19th_December;

public class FindIfPathExistsInGraph_SecondIteration {
    //Works for 19/27 test cases
    // fails at 20th test case
    //fails at: [[4,3],[1,4],[4,8],[1,7],[6,4],[4,2],[7,4],[4,0],[0,9],[5,4]]
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n==0)return source==destination;
        for(int i=0;i<n;i++){
            if( (edges[i][0]==source && edges[i][1]==destination)||(edges[i][0]==destination && edges[i][1]==source)){
                return true;
            }
        }
        int sour=edges[0][0];
        int dest=edges[0][1];
        for(int i=1;i<n;i++){
            if(edges[i][0]==sour || edges[i][0]==dest){
                sour=edges[i][0];
                dest=edges[i][1];
            }else{
                return false;
            }
        }
        return true;

    }
}
