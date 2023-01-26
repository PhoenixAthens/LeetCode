package December_2022.From_19th_December;

public class FindIfPathExistsInGraph {
    //works for 10/27 test-cases
    //fails at 11th test case
    //Still working on it!!
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int EdgeLen= edges.length;
        if(EdgeLen==0){
            return source==destination;
        }else{
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
    public static void main(String...args){
        int[][] arr=new int[][]{{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,9},{5,4}};

    }
}
/* Scrap:
    HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<edges.length;i++){
            set.add(edges[i][0]);
        }
    return set.size()==destination;
* */
//sour==source && dest==destination;


//11th test case:
/*
        n = 10
        edges = [[4,3],[1,4],[4,8],[1,7],[6,4],[4,2],[7,4],[4,0],[0,9],[5,4]]
        source = 5
        destination = 9
        10 / 27 testcases passed
        Output: false
        Expected: true
*/