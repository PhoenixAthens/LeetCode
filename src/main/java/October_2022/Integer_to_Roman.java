package October_2022;

import java.util.*;
public class Integer_to_Roman {
    //Runtime: 10ms beats 43.58%, Memory: 44.7MB beats 37.59%
    public static String intToRoman(int num) {
        int[] digits=new int[String.valueOf(num).length()];
        if(num>10){
            int buff=1;
            for(int i=digits.length-1;num!=0;i--){
                digits[i]=num%10*buff;
                num/=10;
                buff*=10;
            }
        }else{
            digits[0]=num;
        }
        StringBuilder mainString= new StringBuilder();
        int times=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]>=1000){
               times=digits[i]/1000;
               for(int j=0;j<times;j++){
                   mainString.append("M");}
            }else if(digits[i]==900){
                mainString.append("CM");
            }else if(digits[i]>=500){
                times=(digits[i]-500)/100;
                mainString.append("D");
                for(int j=0;j<times;j++){
                    mainString.append("C");}
            }else if(digits[i]==400){
                mainString.append("CD");
            }else if(digits[i]>=100){
                times=(digits[i]-100)/100;
                mainString.append("C");
                for(int j=0;j<times;j++){
                    mainString.append("C");}
            }else if(digits[i]==90){
                mainString.append("XC");
            }else if(digits[i]>=50){
                times=(digits[i]-50)/10;
                mainString.append("L");
                for(int j=0;j<times;j++){
                    mainString.append("X");}
            }else if(digits[i]==40){
                mainString.append("XL");
            }else if(digits[i]>=10){
                times=(digits[i]-10)/10;
                mainString.append("X");
                for(int j=0;j<times;j++){
                    mainString.append("X");}
            }else if(digits[i]==9){
                mainString.append("IX");
            }else if(digits[i]>=5){
                times=(digits[i]-5);
                mainString.append("V");
                for(int j=0;j<times;j++){
                    mainString.append("I");}
            }else if(digits[i]==4){
                mainString.append("IV");
            }else if(digits[i]>0){
                times=(digits[i]-1);
                mainString.append("I");
                for(int j=0;j<times;j++){
                    mainString.append("I");}
            }
        }
        return mainString.toString();
    }
    public static void main(String...args){
        System.out.println(intToRoman(3));
    }
}
//This is how it should have been
//There must be some mathematical way to solve this in an easy manner!!
/*
class Solution {
    public String intToRoman(int num) {
        int[] arabics = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arabics.length; i++) {
            while (num - arabics[i] >= 0) {
                sb.append(romans[i]);
                num = num - arabics[i];
            }
        }

        return sb.toString();
    }
}
* */