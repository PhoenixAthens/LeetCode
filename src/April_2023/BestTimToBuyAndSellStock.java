package April_2023;

public class BestTimToBuyAndSellStock {
    //Runtime: 2ms beats 92.59%, Memory: 59.2MB beats 50.99%
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        for(int i:prices){
            min=Math.min(i,min);
            maxProfit=Math.max(maxProfit,i-min);
        }
        return maxProfit;
    }
}
