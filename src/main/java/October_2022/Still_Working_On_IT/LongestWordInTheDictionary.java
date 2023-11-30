package October_2022.Still_Working_On_IT;

import java.util.*;
public class LongestWordInTheDictionary {
    public static String findLongestWord(String s, List<String> dictionary) {
        dictionary.sort(null);
        ArrayList<String> fromS=new ArrayList<>(Arrays.asList(s.split("")));
        String word=null;
        int maxLength=0;
        for(String dict:dictionary){
            ArrayList<String> tempo=new ArrayList<>(Arrays.asList(dict.split("")));
            //tempo.removeIf(x->fromS.contains(x));
           for(String st:fromS){
                tempo.remove(st);
            }
            if(tempo.size()==0){
                if(dict.length()>maxLength){
                    maxLength=dict.length();
                    word=dict;
                }
            }
        }
        return word;
    }
    public static void main(String...args) {
        System.out.println(findLongestWord("aewfafwafjlwajflwajflwafj", new ArrayList<>(Arrays.asList("apple","ewaf","awefawfwaf","awef","awefe","ewafeffewafewf"))));
        ArrayList<String> first=new ArrayList<>(Arrays.asList("a,b,p,d,p,e,l,w,e"));
        ArrayList<String> second=new ArrayList<>(Arrays.asList("a","p","p","l","e"));
        System.out.println(second.removeIf(x->second.contains(x)));
        System.out.println(second);

    }

}
