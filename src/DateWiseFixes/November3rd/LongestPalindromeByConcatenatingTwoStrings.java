package DateWiseFixes.November3rd;

import java.util.*;
public class LongestPalindromeByConcatenatingTwoStrings {
    public static int longestPalindrome(String[] words) {
        ArrayList<String> Words=new ArrayList<>(Arrays.asList(words));
        ArrayList<String> main=new ArrayList<>();
        ArrayList<String> dupe=new ArrayList<>();
        int happening=0;
        for(String s:words){
            if(s.charAt(0)==s.charAt(1)){
                //Solve this part!!
            }else{
                StringBuilder str=new StringBuilder(s);
                if(dupe.contains(str.reverse().toString())){
                    main.add(s);
                    main.add(str.toString());
                    //dupe.remove(s);
                    dupe.remove(str.toString());
                }
                else dupe.add(s);
            }
        }
        System.out.println(Words);
        System.out.println(main);
        System.out.println(dupe);
        return main.size()*2;
    }
    //wordLength==2
    public static void main(String...args){
        System.out.println(longestPalindrome(new String[]{"mm","mm","yb","by","bb","bm","ym","mb","yb","by","mb","mb","bb","yb","by","bb","yb","my","mb","ym"}));
    }
    //"dd","aa","bb","dd","aa","dd","bb","dd","aa","cc","bb","cc","dd","cc"
    //["mm","mm","yb","by","bb","bm","ym","mb","yb","by","mb","mb","bb","yb","by","bb","yb","my","mb","ym"]
}
