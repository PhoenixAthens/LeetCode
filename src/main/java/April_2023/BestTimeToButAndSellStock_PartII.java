package April_2023;

public class BestTimeToButAndSellStock_PartII {
    //Runtime: 1ms beats 97.24%, Memory: 42.7MB beats 45.99%
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        for(int i:prices){
            min=Math.min(min,i);
            int profit=i-min;
            if(profit>0){
                maxProfit+=profit;
                min=i;
            }

        }
        return maxProfit;
    }
    public static void main(String...args){
        System.out.println(new BestTimeToButAndSellStock_PartII().maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(new BestTimeToButAndSellStock_PartII().maxProfit(new int[]{1,2,3,4,5,}));
        System.out.println(new BestTimeToButAndSellStock_PartII().maxProfit(new int[]{7,6,4,3,1}));
    }
}
