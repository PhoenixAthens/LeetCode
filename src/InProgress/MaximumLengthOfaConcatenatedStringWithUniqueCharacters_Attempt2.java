package InProgress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MaximumLengthOfaConcatenatedStringWithUniqueCharacters_Attempt2 {
    public int maxLength(List<String> arr) {
        if(arr.size()==1){
            if(!containDuplicates(arr.get(0),null)) return arr.get(0).length();
            else return 0;
        }else{
            ArrayList<String> poss=new ArrayList<>();
            for(int i = 0; i< arr.size(); i++){
                String a=arr.get(i);
                for (int j =0; j < arr.size(); j++) {
                    String b=arr.get(j);
                    String c=a+b;
                    poss.add(a);
                    poss.add(c);
                    poss.add(b);

                }
            }
            System.out.println(poss);
            int i = 0;
            for (String str : poss) {
                if (str.length() > i) {
                    i = str.length();
                }
            }
            return i;

        }
    }
    public static boolean containDuplicates(String str, String str2){
        if(str2==null){
            ArrayList<Character> charCheck=new ArrayList<>();
            for(char i:str.toCharArray()){
                if(charCheck.contains(i)){
                    return true;
                }else{
                    charCheck.add(i);
                }
            }
            return false;

        }else{
            HashSet<String> set1=new HashSet<>(Arrays.asList(str.split("")));
            int prevLength=set1.size();
            HashSet<String> set2=new HashSet<>(Arrays.asList(str2.split("")));
            set1.removeAll(set2);
            return set1.size() != prevLength;

        }

    }
    public static void main(String...args){
        System.out.println(new MaximumLengthOfaConcatenatedStringWithUniqueCharacters_Attempt2().maxLength(new ArrayList<>(Arrays.asList(
                "abc","ab","cd","efg","ef","gh"))));
        //System.out.println(containDuplicates("cha","ers"));
        //["abc","ab","cd","efg","ef","gh"]
    }
}
