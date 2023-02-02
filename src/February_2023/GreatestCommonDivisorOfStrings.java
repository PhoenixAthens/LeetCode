package February_2023;

import java.util.ArrayList;
import java.util.Stack;
//Date: 4th Feb, 2023
public class GreatestCommonDivisorOfStrings {
    //Runtime: 3ms beats 22%, Memory: 41.9MB beats 78%;
    public String gcdOfStrings(String str1, String str2) {
        int ln1=str1.length();
        int ln2=str2.length();
        ArrayList<String> found=new ArrayList<>();
        if(ln2<=ln1)return user(str1,str2,ln1,ln2);
        else return user(str2,str1,ln2,ln1);

    }
    public String user(String str1,String str2, int ln1, int ln2){
        int temp=ln2;
        int i=0;
        StringBuffer make=new StringBuffer();
        make.append(str2.charAt(i++));
        int makeLength=make.length();
        String turnIn="";
        while(i<=ln2){
            if(ln1%makeLength==0 && temp%makeLength==0){
                int val=ln1/makeLength;
                int val2=temp/makeLength;
                String p1=make.toString().repeat(val);
                String p2=make.toString().repeat(val2);
                if(p1.equals(str1) && p2.equals(str2)){
                    if(make.toString().length()>turnIn.length())turnIn=make.toString();
                }
            }
            if(i==ln2)break;
            make.append(str2.charAt(i++));
            makeLength=make.length();
            if(makeLength>ln1)break;
        }
        return turnIn;
    }
    public static void main(String...args){
        System.out.println(new GreatestCommonDivisorOfStrings().gcdOfStrings("ABCABC","ABC"));
        System.out.println(new GreatestCommonDivisorOfStrings().gcdOfStrings("LEET","CODE"));
        System.out.println(new GreatestCommonDivisorOfStrings().gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        System.out.println(new GreatestCommonDivisorOfStrings().gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXX"));
        System.out.println(new GreatestCommonDivisorOfStrings().gcdOfStrings("ABABABAB","ABAB"));
    }
}
