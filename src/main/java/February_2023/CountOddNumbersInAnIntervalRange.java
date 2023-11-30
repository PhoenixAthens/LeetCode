package February_2023;
//Date:13th of Feb, 2023
public class CountOddNumbersInAnIntervalRange {
    //Runtime: 521ms, Memory: 39.1MB
    //I have a better solution!!
    public int countOdds(int low, int high) {
        int count=0;
        if(low%2!=0 && high%2!=0)count++;
        while(low<high){
            low+=2;
            count++;
        }
        return count;
    }
    public static void main(String...args){
        var result1=new CountOddNumbersInAnIntervalRange().countOdds(3,7);
        var result2=new CountOddNumbersInAnIntervalRange().countOdds(2,10);
        var result3=new CountOddNumbersInAnIntervalRange().countOdds(8,10);
        var result4=new CountOddNumbersInAnIntervalRange().countOdds(14,17);
        var result5=new CountOddNumbersInAnIntervalRange().countOdds(13,18);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }

}
