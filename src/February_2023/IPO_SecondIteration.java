package February_2023;
public class IPO_SecondIteration {
    //Time limited exceeded at 33rd out of 35 test case
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        while(k!=0){
            int maxProfit=0;
            int foundAtKey=-1001;
            for(int i=0;i<capital.length;i++){
                if(capital[i]<=w){
                    if(profits[i]>=maxProfit){
                        maxProfit=profits[i];
                        foundAtKey=i;
                    }
                }
            }
            if(foundAtKey==-1001)break;
            w+=maxProfit;
            k--;
            capital[foundAtKey]=-1001;
            profits[foundAtKey]=-1001;
        }
        return w;
    }
    public static void main(String...args){
        var value=new IPO_SecondIteration().findMaximizedCapital(2,0,new int[]{1,2,3},new int[]{0,1,1});
        System.out.println(value);
        var value2=new IPO_SecondIteration().findMaximizedCapital(3,0,new int[]{1,2,3},new int[]{0,1,2});
        System.out.println(value2);
        var value3=new IPO_SecondIteration().findMaximizedCapital(11,11, new int[]{1,2,3}, new int[]{11,12,13});
        System.out.println(value3);
        //var value4=new IPO_FirstIteration().findMaximizedCapital(111,12)
    }
}
/*{0=[1], 1=[2, 3]}
        4
        {0=[1], 1=[2], 2=[3]}
        6
        {11=[1], 12=[2], 13=[3]}
        17*/
