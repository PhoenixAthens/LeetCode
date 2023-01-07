package JAN_7_2023;

import java.util.ArrayList;

public class GasStation {
    //works for 22/37 test cases
    public int canCompleteCircuit(int[] gas, int[] cost) {
        ArrayList<Integer> indexes=new ArrayList<>();
        for(int i=0;i< gas.length;i++){
            if(gas[i]>cost[i]){
                indexes.add(i);

            }
        }
        for(int value:indexes){
            int sum=0;
            int i=value;
            if(i==0){
                for(;i<gas.length;i++){
                    sum+=(gas[i]-cost[i]);
                }
            }else{
                while(true){
                    sum+=(gas[i]-cost[i]);
                    if(i==value-1)break;
                    i++;
                    if(i== gas.length)i=0;
                }
            }
            if(sum>=0){
                return value;

            }
        }
        return -1;
    }
    public static void main(String...args){
        System.out.println(new GasStation().canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
        System.out.println(new GasStation().canCompleteCircuit(new int[]{2,3,4},new int[]{3,4,3}));
    }
}
