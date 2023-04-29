package April_2023;

public class Rotate_Image {
    //Runtime: 0ms beats 100%, Memory: 42.8MB beats 18.48%
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        for(int i=0;i<len/2;i++){
            int[] temp=matrix[i];
            matrix[i]=matrix[len-i-1];
            matrix[len-i-1]=temp;
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
    }
}
