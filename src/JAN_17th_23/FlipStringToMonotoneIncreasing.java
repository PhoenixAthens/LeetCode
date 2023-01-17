package JAN_17th_23;
import java.util.ArrayDeque;
import java.util.Stack;

public class FlipStringToMonotoneIncreasing{
    //works for 65/93 test cases
    public int minFlipsMonoIncr(String s) {
        int output=0;
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.push(s.charAt(0)=='0'?0:1);
        for(int i=1;i<s.length();i++){
            int currentVal=0;
            if(s.charAt(i)=='1')currentVal=1;
            int count=0;
            if(deque.peek()>currentVal){
                output++;
                while(!deque.isEmpty()){
                    deque.pop();
                    count++;
                }
            }
            deque.push(currentVal);
            while(count!=0){
                deque.push(1);
                count--;
            }
        }
        int zeroes=0;
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') zeroes++;
            else ones++;

        }
        int misplacedZeroes=0;
        int misplacedOnes=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                for(int j=0;j<i;j++){if(s.charAt(j)=='1'){misplacedZeroes++;break;}}
            }else{
                for(int j=i+1;j<s.length();j++){if(s.charAt(j)=='0'){misplacedOnes++;break;}}
            }
        }
        output=Math.min(output,Math.min(zeroes,ones));
        output=Math.min(output,Math.min(misplacedOnes,misplacedZeroes));
        return output;
    }
    public static void main(String...args){
        int val=new FlipStringToMonotoneIncreasing().minFlipsMonoIncr("0010");
        int val2=new FlipStringToMonotoneIncreasing().minFlipsMonoIncr("010110");
        int val3=new FlipStringToMonotoneIncreasing().minFlipsMonoIncr("00011000");
        int val4=new FlipStringToMonotoneIncreasing().minFlipsMonoIncr("11011");
        int val5=new FlipStringToMonotoneIncreasing().minFlipsMonoIncr("0101100011");
        System.out.println(val);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
    }
}
