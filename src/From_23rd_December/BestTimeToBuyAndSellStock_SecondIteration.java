package From_23rd_December;
import java.util.ArrayList;
public class BestTimeToBuyAndSellStock_SecondIteration {
    //works for 176/211 test cases
    //fails at 177 test case
    public int maxProfit(int[] prices) {
        int indexOfMin=0;
        int len=prices.length;
        int min=6_000;
        for(int i=0;i<len-1;i++){
            int present=prices[i];
            if(present<min){
                min=present;
                indexOfMin=i;
            }
        }
        int maxProfit=0;
        for(int i=indexOfMin+1;i<len;i++){
            int present=prices[i];
            if(present-min>maxProfit)maxProfit=present-min;
        }
        return maxProfit;
    }
}
