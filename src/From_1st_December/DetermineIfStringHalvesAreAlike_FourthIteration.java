package From_1st_December;

import java.util.ArrayList;
import java.util.Arrays;

public class DetermineIfStringHalvesAreAlike_FourthIteration {
    /**
     * Runtime: 83 ms, Beats 5.5%
     * Memory: 47.5 Ms, Beats 5.34%
     */
    public static boolean halvesAreAlike(String s) {
        int f0=0;
        int f1=0;
        int main=0;
        int length=s.length();
        String[] arr=s.split("");
        int i=0;
        for(String p:arr){
            p=p.toLowerCase();
            if(p.equals("a")||p.equals("e")||p.equals("i")||p.equals("o")||p.equals("u")){
                main++;
            }
            if(i==length/2-1){
                f0=main;
                main=0;
            }
            i++;
        }
        f1=main;
        return f1 == f0;
    }
    public static void main(String...args){
        halvesAreAlike("AbCdEfGh");
    }
}
    /*public boolean halvesAreAlike(String s) {
        ArrayList<Character> characters=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int f0=0;
        int f1=0;
        int main=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            if(characters.contains(s.charAt(i))){
                main++;
            }
            if(i==length/2-1){
                f0=main;
                main=0;
            }
        }
        f1=main;
        return f1 == f0;
    }



}

     */
