package March_2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//Date: 19th March 2023
public class WordDictionary {
    //Runtime: 2004ms beats 5.1%, Memory: 51.1MB beats 97.91%
    HashMap<Integer, ArrayList<String>> map;
    public WordDictionary() {
        map=new HashMap<>();
    }

    public void addWord(String word) {
        int len=word.length();
        if(this.map.containsKey(len)){
            this.map.get(len).add(word);
        }else{
            this.map.put(len,new ArrayList<>(List.of(word)));
        }
    }

    public boolean search(String word) {
        int len=word.length();
        if(!map.containsKey(len))return false;
        else{
            ArrayList<String> obtained=map.get(len);
            for(String i:obtained){
                boolean flag=true;
                for(int lvl=0;lvl<len;lvl++){
                    if(word.charAt(lvl)!='.'){
                        if(word.charAt(lvl)!=i.charAt(lvl)){
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag)return true;
                else flag=true;
            }
            return false;
        }
    }
    public static void main(String...args){
        WordDictionary wd=new WordDictionary();
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");
        System.out.println(wd.search("pad"));
        System.out.println(wd.search("bad"));
        System.out.println(wd.search(".ad"));
        System.out.println(wd.search("b.."));
        /*String[] words="hello.my.friend".split("\\.");
        System.out.println(java.util.Arrays.toString(words));
        System.out.println(words[1]);
        System.out.println(words[1].length());*/
    }
}
