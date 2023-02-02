package February_2023;

import java.util.HashMap;
//Date: 2nd Feb, 2023
public class VerifyingAnAlienDictionary {
    //Runtime: 1ms beats 65.29%, Memory: 41.9MB beats 62.49%
    public boolean isAlienSorted(String[] words, String order) {
        if(words.length==1)return true;
        HashMap<Character,Integer> orderOfLetters=new HashMap<>();
        for(int i=0;i<order.length();i++){
            orderOfLetters.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length-1;i++){
            int len1=words[i].length();
            int len2=words[i+1].length();
            int limit=Math.min(len1,len2);
            int j=0;
            for(;j<limit;j++){
                int char1=orderOfLetters.get(words[i].charAt(j));
                int char2=orderOfLetters.get(words[i+1].charAt(j));
                if(char1<char2)break;
                else if(char1>char2)return false;

            }
            if(j==limit &&len1>len2){
                return false;
            }
        }
        return true;
    }
    public static void main(String...args){
        var result1=new VerifyingAnAlienDictionary().isAlienSorted(new String[]{"apple","app"},"abcdefghijklmnopqrstuvwxyz");
        var result2=new VerifyingAnAlienDictionary().isAlienSorted(new String[]{"word","world","row"},"worldabcefghijkmnpqstuvxyz");
        var result3=new VerifyingAnAlienDictionary().isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz");
        System.out.println("Result1: "+result3);
        System.out.println("Result2: "+result2);
        System.out.println("Result3: "+result1);
    }
}
