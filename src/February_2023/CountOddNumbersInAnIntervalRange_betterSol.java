package February_2023;
//Date: 13th Feb, 2023
public class CountOddNumbersInAnIntervalRange_betterSol {
    //Runtime: 0ms beats 100%, Memory: 39.3MB beats 43.83%
    public int countOdds(int low, int high) {
        if(high-low==1)return 1;
        int count=0;
        if(low%2!=0 || high%2!=0)count++;
        count+=(high-low)/2;
        return count;
    }
}
