package InProgress;

import java.util.*;

public class MaximumLengthOfaConcatenatedStringWithUniqueCharacters {
    public int maxLength(List<String> arr) {
        if(arr.size()==1){
            if(!containDuplicates(arr.get(0),null)) return arr.get(0).length();
            else return 0;
        }else{
            ArrayList<String> poss = getStrings(arr);
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

    private static ArrayList<String> getStrings(List<String> arr) {
        ArrayList<String> poss=new ArrayList<>();
        String prevPart=null;
        String lasPart=null;
        for(int i = 0; i< arr.size(); i++){
            prevPart=arr.get(i);lasPart=arr.get(i);
            String a= arr.get(i);
            if(!containDuplicates(a,null)) {
                for (int j = i + 1; j < arr.size(); j++) {
                    String b = arr.get(j);
                    if (!containDuplicates(b, null)) {
                        if(!containDuplicates(prevPart,b)){
                            lasPart=prevPart;
                            prevPart+=b;
                            poss.add(prevPart);
                        }
                        else if(!containDuplicates(a,b)){
                            a+=b;
                            poss.add(a);
                        }
                        else if(!containDuplicates(arr.get(i),b)){
                            poss.add(arr.get(i)+b);
                        }else{
                            poss.add(a);
                            poss.add(b);
                        }
                        if(!containDuplicates(lasPart,b)){
                            lasPart+=b;
                            poss.add(lasPart);
                        }

                    }
                }
            }
        }
        return poss;
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
        System.out.println(new MaximumLengthOfaConcatenatedStringWithUniqueCharacters().maxLength(new ArrayList<>(Arrays.asList(
                "abc","ab","cd","efg","ef","gh"))));
        //System.out.println(containDuplicates("cha","ers"));
        //["abc","ab","cd","efg","ef","gh"]
    }

}
