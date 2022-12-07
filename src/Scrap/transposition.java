package Scrap;

public class transposition {
    public static int[][] transpose(int[][] entry){
        int[][] matrix=new int[entry[0].length][entry.length];
        for(int i=0;i<entry[0].length;i++){
            for(int j=0;j<entry.length;j++){
                matrix[i][j]=entry[j][i];
            }
        }
        return matrix;
    }
    public static void main(String...args){
        int[][] example=new int[][]{{7,10,15},{140,30,40}};
        int[][] transposition=transpose(example);
        System.out.println("A= ");
        for(int[] ints: example){
            System.out.println(java.util.Arrays.toString(ints));
        }
        System.out.println("================================================");
        System.out.println("A^T");
        for (int[] ints : transposition) {
            System.out.println(java.util.Arrays.toString(ints));
        }
        System.out.println("================================================");
        System.out.println("(A^T)^T");
        int[][] double_Transpose=transpose(transposition);
        for (int[] ints : double_Transpose) {
            System.out.println(java.util.Arrays.toString(ints));
        }

    }
}
