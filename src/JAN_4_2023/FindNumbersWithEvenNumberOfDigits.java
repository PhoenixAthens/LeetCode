package JAN_4_2023;

public class FindNumbersWithEvenNumberOfDigits {
    //Runtime: 5ms beats 23.21%, Memory: 43.8MB beats 22.89%
    //
    // after some changes
    //
    //Runtime: 1ms beats 99.50%, Memory:41.6MB beats 95.92%
    public int findNumbers(int[] nums) {
       int count=0;
       for(int i:nums){
           /*if(String.valueOf(i).length()%2==0)count++;*/
           if((i>=10 && i<100)||(i>=1000 && i<10_000)||(i==100_000))count++;
               //100 000
       }
       return count;
    }

}
