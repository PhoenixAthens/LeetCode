package JAN_6_2023;

public class MaximumIceCreamBars_ED3 {
    //This code is inspired by someone else's code, NOT ORIGINAL, just me trying to understand how it works!!
    //First Iteration (Same in case of 2nd and 3rd iteration as well)
    //Runtime: 7ms beats 98.58%, Memory: 50.2MB beats 99.29%
    public int maxIceCream(int[] costs, int coins) {
        int maxVal=0;
        for(int i:costs){
            if(i>maxVal)maxVal=i;
        }
        int[] newArr=new int[maxVal+1];
        for(int i:costs){
            newArr[i]++;
        }
        System.out.println(java.util.Arrays.toString(newArr));
        //The method above is a tricky way to sort an Array;
        int maxIce=0;
        for(int i=1;i<=maxVal;i++){
            if(newArr[i]!=0){
                for(int j=0;j<newArr[i];j++){
                    if(coins>=i){
                        coins-=i;
                        maxIce++;
                    }else break;
                }
            }
            if(coins==0)break;
        }
        return maxIce;
    }
    public static void main(String...args){
        //int val=new MaximumIceCreamBars_ED3().maxIceCream(new int[]{1,3,2,4,1},7);
        int val2=new MaximumIceCreamBars_ED3().maxIceCream(new int[]{1,6,3,1,2,5},20);
        //20-1
        //19-1
        //18-2
        //16-3
        //13-5
        //8-6
        //2
        System.out.println(val2);
        //System.out.println(val);
    }
}
