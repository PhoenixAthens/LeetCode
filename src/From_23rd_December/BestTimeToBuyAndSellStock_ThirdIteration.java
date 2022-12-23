package From_23rd_December;

public class BestTimeToBuyAndSellStock_ThirdIteration {
    //Runtime:201ms, Memory:59.6MB
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int min=100_000;
        int maxProfit=0;
        for(int i=0;i<len-1;i++){
            int present=prices[i];
            if(present<min){
                min=present;
                for(int j=i+1;j<len;j++){
                    present=prices[j];
                    if(present-min>maxProfit)maxProfit=present-min;
                }
            }
        }


        return maxProfit;
    }
}
