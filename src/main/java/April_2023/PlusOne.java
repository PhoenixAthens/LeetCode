package April_2023;
import java.util.Arrays;

public class PlusOne {
    //Runtime: 1ms beats 100%, Memory: 41.3MB beats 18.1%
    public int[] plusOne(int[] digits) {
        int len=digits.length-1;
        int remainder=1;
        while(remainder!=0 && len>-1){
            int temp=digits[len]+1;
            digits[len--]=temp%10;
            remainder=temp/10;
        }
        if(remainder==1){
            int[] digitsTwiceOver=new int[digits.length+1];
            digits[0]=digits[0]%10;
            digitsTwiceOver[0]=1;
            int cnt=1;
            for(int i:digits){
                digitsTwiceOver[cnt++]=i;
            }
            return digitsTwiceOver;
        }
        return digits;
    }
    public static void main(String...args){
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{1,2,3})));
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{9})));
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{8,9,9,9})));
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));//9_876_543_210


    }
}
