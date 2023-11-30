package December_2022.From_17th_December;

public class RichestCustomerWealth_SecondIteration {
    //Runtime: 2ms, Memory: 41.7MB
    // Replacing Approach 1 with Approach 2 give:
    //FI: Runtime: 0ms, Memory: 41.8MB
    //SI: Runtime: 0ms, Memory: 41.9MB
    //TI: Runtime: 0ms, Memory: 41.7MB
    public int maximumWealth(int[][] accounts) {
        int len=accounts.length;
        int cols=accounts[0].length;
        int[] guys=new int[len];
        for(int i=0;i<cols;i++){
            int j=0;
            while(j<len){
                guys[j]+=accounts[j][i];
                j++;
            }
        }
        //Approach 1
        //Arrays.parallelSort(guys);
        //return guys[len-1];

        //Approach 2
        if(len==1)return guys[0];
        else{
            int max=0;
            for(int i=0;i<len-1;i+=2){
                max=Math.max(max,Math.max(guys[i],guys[i+1]));
            }
            return max;
        }
    }
}
