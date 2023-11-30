package May_2023;

public class MatrixDiagonalSum {
    //Runtime: 0ms, Memory: 42.5MB
    public int diagonalSum(int[][] mat) {
        int len=mat.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=mat[i][i];
        }
        int n=len-1;
        for(int i=0;i<len;i++){
            sum+=mat[i][n--];
        }
        if(len%2!=0){
            int mid=len/2;
            sum-=mat[mid][mid];
        }
        return sum;
    }
}
