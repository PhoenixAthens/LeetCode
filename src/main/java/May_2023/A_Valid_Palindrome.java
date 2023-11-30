package May_2023;

import java.util.ArrayList;
//Date: 2nd May 2023
public class A_Valid_Palindrome {
    //Runtime: 4ms beats 70.92%, Memory: 42.8MB beats 68.12%
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] arr=s.toCharArray();
        ArrayList<Character> main=new ArrayList<>();
        for(char i:arr){
            if((i>=97 && i<=122) || (i>=48 && i<=57))main.add(i);
        }
        int len=main.size();
        if(len<=1)return true;
        int end=(len-1)/2;
        int last=len-1;
        if(len%2!=0){
            for(int i=0;i<end;i++){
                if(main.get(i)!=main.get(last--))return false;
            }
        }else{
            for(int i=0;i<=end;i++){
                if(main.get(i)!=main.get(last--))return false;
            }
        }
        return true;

    }
    public static void main(String...args){
        System.out.println(new A_Valid_Palindrome().isPalindrome("A man, a plan, a canal: Panama"));
        //System.out.println(new A_Valid_Palindrome().isPalindrome("race a car"));
//        int val='0';
//        int val2='9';
//        System.out.println(val+" : "+val2);

    }
}
