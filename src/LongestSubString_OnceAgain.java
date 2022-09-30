import java.util.*;
public class LongestSubString_OnceAgain {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        List<Integer> lengthList=new ArrayList<>();
        List<Character> characterList;
        int i=0;
        while(i<s.length()){
            characterList=new ArrayList<>();
            boolean flag=false;
            for(;i<s.length();i++){
                if(characterList.contains(s.charAt(i))){
                    flag= lengthList.add(characterList.size());
                    i--;
                    //System.gc();
                    break;
                }
                characterList.add(s.charAt(i));

            }
            if(!flag) lengthList.add(characterList.size());
        }
        System.out.println(lengthList);
        lengthList.sort(null);
        return lengthList.get(lengthList.size()-1);

    }
    public static void main(String...args){
        System.out.println(lengthOfLongestSubstring("abcabcabb"));

    }
}
