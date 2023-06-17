package June_2023;

public class Negative_Numbers_In_A_SortedMatrix {
    //Runtime: 1ms, Memory: 44.6MB
    public int countNegatives(int[][] grid) {
        int num=0;
        for(int[] currRow: grid) for(int i:currRow) if(i<0) num++;
        return num;
    }
}
