package From_19th_December;

public class FindIfPathExistInGraph {
    //Works for 19/27 test cases
    // fails at 20th test case
    //fails at: [[4,3],[1,4],[4,8],[1,7],[6,4],[4,2],[7,4],[4,0],[0,9],[5,4]]
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int len=edges.length;
        if(len==0)return source==destination;
        for(int i=0;i<len;i++){
            if( (edges[i][0]==source && edges[i][1]==destination)||(edges[i][0]==destination && edges[i][1]==source)){
                return true;
            }
        }
        int sour=edges[0][0];
        int dest=edges[0][1];
        for(int i=1;i<edges.length;i++){
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
