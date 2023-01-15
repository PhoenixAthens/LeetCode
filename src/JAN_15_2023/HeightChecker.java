package JAN_15_2023;

import java.util.Arrays;

public class HeightChecker {
    //Runtime: 2ms beats 52.39%, Memory:39.6MB beats 99.76%
    public int heightChecker(int[] heights) {
        int[] make2= Arrays.copyOf(heights,heights.length);
        Arrays.parallelSort(make2);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(make2[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
    /*int switcher=0;
    int minIndex=0;
        for(int i=0;i<heights.length-1;i++){
        if(heights[i+1]<heights[i]){
            if(switcher==0)switcher+=2;
            else switcher++;
            minIndex=i+1;
            for(int j=i+1;j<heights.length;j++){
                if(heights[j]<heights[minIndex])minIndex=j;
            }
            int temp=heights[i];
            heights[i]=heights[minIndex];
            heights[minIndex]=temp;
        }
    }*/
    public static void main(String...args){
        new HeightChecker().heightChecker(new int[]{1,1,4,2,1,3});
        new HeightChecker().heightChecker(new int[]{5,1,2,3,4});
    }
}
