package July_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class KruskalMST {
    public static void main(String...args){
        /*HashMap<Integer, ArrayList<int[]>> linker=new HashMap<>();
        linker.put(0, new ArrayList<>(Arrays.asList(new int[]{1, 11},new int[]{3,7})));
        linker.put(1, new ArrayList<>(Arrays.asList(new int[]{})))
        */
        /*int[][] linker = new int[49][2];
        linker[0]= new int[]{1, 11};
        linker[]*/
        int[][] linker = new int[49][3];
        linker[0]=new int[]{0,0,0};
        linker[1]=new int[]{0,1,11};
        linker[2]=new int[]{0,2,7};
        linker[3]=new int[]{0,3,-123};
        linker[4]=new int[]{0,4,11};
        linker[5]=new int[]{0,5,11};
        linker[6]=new int[]{0,6,11};
        linker[7]=new int[]{1,0,11};
        linker[8]=new int[]{1,1,11};
        linker[9]=new int[]{1,2,11};
        linker[10]=new int[]{1,3,11};
        linker[11]=new int[]{1,4,11};
        linker[12]=new int[]{1,5,11};
        linker[13]=new int[]{1,6,11};
        linker[14]=new int[]{2,0,11};
        linker[15]=new int[]{2,1,11};
        linker[16]=new int[]{2,2,11};
        linker[17]=new int[]{2,3,11};
        linker[18]=new int[]{2,4,11};
        linker[19]=new int[]{2,5,11};
        linker[20]=new int[]{2,6,11};
        linker[21]=new int[]{3,0,11};
        linker[22]=new int[]{3,1,11};
        linker[23]=new int[]{3,2,11};
        linker[24]=new int[]{3,3,11};
        linker[25]=new int[]{3,4,11};
        linker[26]=new int[]{3,5,11};
        linker[27]=new int[]{3,6,11};
        linker[28]=new int[]{4,0,11};
        linker[29]=new int[]{4,1,11};
        linker[30]=new int[]{4,2,11};
        linker[31]=new int[]{4,3,11};
        linker[32]=new int[]{4,4,11};
        linker[33]=new int[]{4,5,11};
        linker[34]=new int[]{4,6,11};
        linker[35]=new int[]{5,0,11};
        linker[36]=new int[]{5,1,11};
        linker[37]=new int[]{5,2,11};
        linker[38]=new int[]{5,3,11};
        linker[39]=new int[]{5,4,11};
        linker[40]=new int[]{5,5,11};
        linker[41]=new int[]{5,6,11};
        linker[42]=new int[]{6,0,11};
        linker[43]=new int[]{6,1,11};
        linker[44]=new int[]{6,2,11};
        linker[45]=new int[]{6,3,11};
        linker[46]=new int[]{6,4,11};
        linker[47]=new int[]{6,5,11};
        linker[48]=new int[]{6,6,11};

    }
}
