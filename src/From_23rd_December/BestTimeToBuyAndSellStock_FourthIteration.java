package From_23rd_December;

public class BestTimeToBuyAndSellStock_FourthIteration {
    //Runtime: 1ms, Memory: 59MB
    //Inspired solution!!, UnORIGINAL :/
    public int maxProfit(int[] prices) {
        int minimum=prices[0];
        int maxProfit=0;
        for(int price:prices){
            minimum=Math.min(minimum,price);
            maxProfit=Math.max(maxProfit,price-minimum);
        }
        return maxProfit;
    }
}
