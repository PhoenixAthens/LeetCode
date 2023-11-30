package May_2023;

public class SpiralMatrix_II {
    //Runtime: 0ms beats 100%, Memory: 40.7MB beats 44.51%
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        boolean inc=true,row=true;
        int finalValue=n*n;
        /*if(n%2!=0){
            int mid=n/2;
            result[mid][mid]=finalValue;
        }*/
        int start=1;
        int rowIndex=0,columnIndex=0;
        int topRow=n,topColumn=n;
        int startRow=0,startColumn=-1;

        while(start<=finalValue){
            if(inc){
                if(row){
                    result[rowIndex][columnIndex++]=start++;
                    if(columnIndex==topRow){
                        rowIndex+=1;
                        columnIndex-=1;
                        row=false;
                        topRow-=1;
                    }
                }else{
                    result[rowIndex++][columnIndex]=start++;
                    if(rowIndex==topColumn){
                        rowIndex-=1;
                        columnIndex-=1;
                        row=true;
                        inc=false;
                        topColumn-=1;
                    }
                }
            }else{
                if(row){
                    result[rowIndex][columnIndex--]=start++;
                    if(columnIndex==startColumn){
                        columnIndex++;
                        rowIndex-=1;
                        row=false;
                        startColumn+=1;
                    }
                }else{
                    result[rowIndex--][columnIndex]=start++;
                    if(rowIndex==startRow){
                        rowIndex+=1;
                        columnIndex+=1;
                        row=true;
                        inc=true;
                        startRow+=1;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String...args){
        int[][] matrix = new SpiralMatrix_II().generateMatrix(100);
        for(int[] arr:matrix){
            System.out.println(java.util.Arrays.toString(arr));
        }
    }

}
