package From_23rd_December;

public class BestTimeToBuyAndSellStock {
    //works for 68/211 test cases
    //fails at th 69th test case!
    public int maxProfit(int[] prices) {
        int len=prices.length;
        boolean buy=false;
        int total=0;
        for(int i=0;i<len;i++){
            if(!buy){
                var find=checkIfThere(i,prices,len);
                if(find){
                    total-=prices[i];
                    buy=true;
                }
            }else{
                var k=indexWithMaxProfit(i,prices,total,len);
                total+=prices[k];
                buy=false;
                i=k;
            }
        }
        return total;
        //criteria to buy a stock, there has to a day after it where price is higher
    }
    public boolean checkIfThere(int index,int[] prices,int len){
        //index=i, same not, i+1
        int set=prices[index];
        for(int i=index;i<len;i++){
            if(prices[i]>set){
                return true;
            }
        }
        return false;
    }
    //first guess find the price with max profit
    public int indexWithMaxProfit(int presentIndex,int[] prices, int presentTotal, int len){
        int max=presentTotal+prices[presentIndex];
        int indexB=0;
        for(int i=presentIndex;i<len;i++){
            int temp=prices[i];
            if(presentTotal+temp>max){
                max=presentTotal+temp;
                indexB=i;
            }
        }
        if(indexB==0)return presentIndex;
        else return indexB;
    }
    //second guess use all profit prices
}
