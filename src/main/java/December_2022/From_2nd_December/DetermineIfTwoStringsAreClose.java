package December_2022.From_2nd_December;
import java.util.*;
public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        //works for 131/152 test cases
        //fails at 131st test case
        if(word1.length()!=word2.length()){
            return false;
        }else{
            TreeMap<String,Integer> map1=new TreeMap<>();
            TreeMap<String,Integer> map2=new TreeMap<>();
            ArrayList<String> fromWord1=new ArrayList<>(Arrays.asList(word1.split("")));
            ArrayList<String> fromWord2=new ArrayList<>(Arrays.asList(word2.split("")));
            for(int i=0;i<fromWord2.size();i++) {
                String present = fromWord1.get(i);
                String drop = fromWord2.get(i);
                if (!fromWord2.contains(present) || !fromWord1.contains(drop)) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String...args){
        System.out.println(closeStrings("cabbba","abbccc"));
    }
    /*
    * if(map1.containsKey(present)){
                        map1.put(present,map1.get(present)+1);
                    }else{
                        map1.put(present,1);
                    }
                    if(map2.containsKey(drop)){
                        map2.put(drop,map1.get(drop)+1);
                    }else{
                        map2.put(drop,1);
                    }
                }
            }
            System.out.println(map1);
            System.out.println(map2);
            ArrayList<Integer> increase=new ArrayList<>(map1.values());
            increase.sort(null);
            System.out.println(increase);
            StringBuilder retain=new StringBuilder();
            for(Integer i:increase){
                retain.append(map2.ke);
            }
            System.out.println(retain.toString());
            return retain.toString().equals(word2);
    * */
}
