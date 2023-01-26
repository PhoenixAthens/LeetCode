package December_2022.From_23rd_December;

public class BestTimeToBuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices) {
        int minimum=prices[0];
        int maxProfit=0;
        int len=prices.length;
        for(int i=0;i<len;i++){
            int present=prices[i];
            minimum=Math.min(minimum,present);
            int prevProf=maxProfit;
            maxProfit=Math.max(maxProfit,present-minimum);
            if(maxProfit!=prevProf){
                i++;
                minimum=0;
                maxProfit=prevProf+maxProfit;
            }
        }
        return maxProfit;
    }
}
/*
* primitively stupid:
*       int len=prices.length;
        int total=0;
        if(len==1) return total;
        else{
            for(int i=0;i<len;i+=3){
                total-=prices[i];
                total+=prices[i+1];
            }
        }
        return Math.max(total, 0);
* */
