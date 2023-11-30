package February_2023;

import java.util.Stack;

//Date: 16th Feb, 2023
public class AddBinary {
    //Runtime: 4ms beats 30.47%, Memory: 42MB beats 47.81%
    public String addBinary(String a, String b) {
        int len1=a.length();
        int len2=b.length();
        int goTill=len2;
        if(len1>len2){
            goTill=len1;
            b="0".repeat(len1-len2)+b;
        }else{
            a="0".repeat(len2-len1)+a;
        }
        //System.out.println("a: "+a+", b: "+b);
        int carry=0;
        Stack<Integer> result=new Stack<>();
        int i=goTill-1;
        for(;i>=0;i--){
            final boolean b2 = a.charAt(i) == '1' && b.charAt(i) == '1';
            final boolean b1=a.charAt(i)=='0' && b.charAt(i)=='0';
            if(carry==0){
                if(b2){
                    result.push(0);
                    carry=1;
                }else if(b1)result.push(0);
                else result.push(1);
            }else{
                if(b2)result.push(1);
                else if(b1){
                    result.push(1);
                    carry=0;
                }
                else result.push(0);
            }
        }
        //System.out.println(result);
        if(carry!=0)result.push(carry);
        StringBuffer buff=new StringBuffer();
        while(!result.empty())buff.append(result.pop());
        return buff.toString();
    }
    public static void main(String...args){
        System.out.println(new AddBinary().addBinary("11","1"));
        System.out.println(new AddBinary().addBinary("1010","1011"));
        System.out.println(new AddBinary().addBinary("0","0"));
    }
}
