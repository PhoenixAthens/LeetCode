package JAN_6_2023;
import java.util.Arrays;
public class MaximumIceCreamBars_ED2 {
    //First Iteration
    //Runtime:30ms beats 96.68 %, Memory: 81.5MB beats 5.21%
    //Second Iteration
    //Runtime:22ms beats 97.39%, Memory: 81MB beats 5.79%
    //
    public int maxIceCream(int[] costs, int coins) {
        Arrays.parallelSort(costs);
        if(coins<costs[0]){
            return 0;
        }
        int howMany=0;
        for(int i:costs){
            coins-=i;
            if(coins<0) break;
            else howMany++;
        }
        return howMany;
    }
}
