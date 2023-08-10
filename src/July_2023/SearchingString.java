package July_2023;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
public class SearchingString {
    public static class Trie{
        HashMap<Character, HashMap> main;
        public Trie(String[] words){
            main = trieCreator(words);
        }
        public HashMap<Character, HashMap> trieCreator(String[] dict){
            HashMap<Character,HashMap> mapMain = new HashMap<>();
            for(String str:dict){
                char[] fromStr = str.toCharArray();
                HashMap<Character,HashMap> current=mapMain;
                for(int i=0;i<fromStr.length;i++){
                    if(!current.containsKey(fromStr[i])){
                        HashMap<Character,HashMap> temp = new HashMap<>();
                        current.put(fromStr[i],temp);
                        current = temp;
                    }else{
                        current = current.get(fromStr[i]);
                    }
                }
            }
            return mapMain;
        }
        public boolean wordSearch(String word){
            char[] arr = word.toCharArray();
            int i = 0;
            HashMap<Character,HashMap> current = main;
            while(i!=arr.length){
                current = current.getOrDefault(arr[i],null);
                if(current!=null)i++;
                else{
                    System.out.println("Word not found!");
                    return false;
                }
            }
            System.out.println("Word found!");
            return true;
        }
    }
    public static void main(String...args){
        var result = new Trie(new String[]{"all","aloud","above","at","about"});
        System.out.println(result.wordSearch("at"));
        System.out.println(result.wordSearch("about"));
        System.out.println(result.wordSearch("al"));
        System.out.println(result.wordSearch("aboud"));
        System.out.println(result.wordSearch("abo"));

    }
    //{a = {b={o={u={t={ } }, v={e={ } } } }, t={ }, l={l={   }, o={ u={ d= {   }  }  }  } } }
    //0    1  2  3  4  5 5 4    6  7 7 6 3 2    8 8    9  10 10    11  12   13 13 12  11 9 1 0
    //PERFECTO


}

