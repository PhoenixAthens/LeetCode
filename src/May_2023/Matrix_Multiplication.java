package May_2023;

public class Matrix_Multiplication {
    private static int[][] matrixMulti_FewerCacheMisses(int[][] a, int[][] b){
        int[][] result = new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int k=0;k<a.length;k++) {
                for(int j=0;j<b[0].length;j++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return result;
    }
    private int[][] multiplicationWrapper(int[][] a, int[][]b){
        int[][] result = new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a.length;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return result;
    }
    public int[][] MatrixMultiplier(int[][]a, int[][]b){
        if(a[0].length!=b.length){
            System.out.println("Multiplication is denied! In-compatible dimensions.");
            return null;
        }else{
            return multiplicationWrapper(a,b);
        }
    }
    public static void main(String...args){
        int[][] matrix1={
                {1,2,3,4,5},
                {5,4,3,2,1},
                {9,8,2,44,6},
                {1,3,5,7,6},
                {11,22,33,44,55}
        };
        int[][] matrix2={
                {1,2},
                {4,5},
                {9,10},
                {11,99},
                {101,325}
        };
        int[][] result=new Matrix_Multiplication().MatrixMultiplier(matrix1,matrix2);
        for (int[] value : result) {
            System.out.println(java.util.Arrays.toString(value));
        }
        int[][] result_Alt=matrixMulti_FewerCacheMisses(matrix1, matrix2);
        for (int[] ints : result_Alt) {
            System.out.println(java.util.Arrays.toString(ints));
        }
    }
}
