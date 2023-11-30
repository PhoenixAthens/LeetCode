package May_2023;

import java.util.ArrayList;

public class StringToInteger {
    //Bad Science: Working on it!
    public int myAtoi(String s) {
        char[] arr=s.toCharArray();
        ArrayList<Integer> numbers=new ArrayList<>();
        boolean positive=true;
        boolean signDone=false;
        int count=0;
        for(char i:arr){
            if(signDone && (i==45 ||i==43))return 0;
            if(positive && i==45){
                positive=false;
                signDone=true;
                count++;
            }
            if(i>=48 && i<=57){
                numbers.add(i-48);
                count++;
            }else if(i!=32 && count==0)return 0;
            if(!numbers.isEmpty() && (i<48||i>57))break;
        }
        int len=numbers.size();
        //2_000_000_000
        int result=0;
        int start=0;
        while(numbers.get(start)==0){
            start++;
        }
        if(positive){
            if(len>10)return Integer.MAX_VALUE;
            else{
                for(int i=start;i<len;i++){
                    result+=numbers.get(i);
                    result*=10;
                }
                result/=10;
                if(result<0)return Integer.MAX_VALUE;
                return result;
            }
        }else{
            if(len>10)return Integer.MIN_VALUE;
            else{
                for(int i=start;i<len;i++){
                    result+=numbers.get(i);
                    result*=10;
                }
                result/=10;
                if(result<0)return Integer.MIN_VALUE;
                return -result;
            }
        }
    }
    public static void main(String...args){
        /*int val='+';
        int val2='-';
        int val3='0';
        int val4='9';
        System.out.println(val+":"+val2+":"+val3+":"+val4);*/
        System.out.println(new StringToInteger().myAtoi("42"));
        System.out.println(new StringToInteger().myAtoi("  -42"));
        System.out.println(new StringToInteger().myAtoi("4193 with words"));
        int val=' ';
        System.out.println(val);
    }

}
