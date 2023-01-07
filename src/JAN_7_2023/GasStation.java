package JAN_7_2023;

import java.util.ArrayList;

public class GasStation {
    //works for 22/37 test cases
    //After minor tweaks
    //works for 36/37 test cases
    //Another minor tweak
    //Runtime: 824ms beats 5.5%, Memory: 55.3MB beats 99.37%

    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==1){
            if(gas[0]>=cost[0])return 0;
            return -1;
        }
        ArrayList<Integer> indexes=new ArrayList<>();
        for(int i=0;i< gas.length;i++){
            if(gas[i]>=cost[i]){
                indexes.add(i);

            }
        }
        for(int value:indexes){
            int sum=0;
            int i=value;
            if(i==0){
                for(;i<gas.length;i++){
                    sum+=(gas[i]-cost[i]);
                    if(sum<0)break;
                }
            }else{
                while(true){
                    sum+=(gas[i]-cost[i]);
                    if(sum<0)break;
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
