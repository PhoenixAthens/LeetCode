package JAN_7_2023;

import java.util.ArrayList;

public class GasStation_ED2 {
    //Runtime: 815ms beats 5.5%, Memory: 62.1MB beats 91.68%
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==1){
            if(gas[0]>=cost[0])return 0;
            return -1;
        }
        for(int i=0;i< gas.length;i++){
            if(gas[i]>cost[i]){
                int sum=0;
                int j=i;
                if(j==0){
                    for(;j<gas.length;j++){
                        sum+=(gas[j]-cost[j]);
                        if(sum<0)break;
                    }
                }else{
                    while(j!=i-1){
                        sum+=(gas[j]-cost[j]);
                        if(sum<0)break;
                        j++;
                        if(j== gas.length)j=0;

                    }
                }
                if(sum>=0){
                    return i;

                }
            }

        }
        return -1;

    }
}
