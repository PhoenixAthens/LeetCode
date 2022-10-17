import java.util.*;
public class MaxIceCreams {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.parallelSort(costs);
        if(coins==0 || coins<costs[0]){
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
    public static void main(String...args){
        System.out.println(new MaxIceCreams().maxIceCream(new int[]{1,6,3,1,2,5},20));
    }
}
