package JAN_1_2023;
import java.util.HashMap;
public class RansomNote_ED2 {
    //Runtime:12ms beats 61.37%, Memory: 42.6MB beats 88.53%
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> fromMagazine=new HashMap<>();
        int len=magazine.length();
        int currentVal;
        char pChar;
        for(int i=0;i<len;i++){
            pChar=magazine.charAt(i);
            currentVal=fromMagazine.getOrDefault(pChar,0);
            fromMagazine.put(pChar,currentVal+1);
        }
        len=ransomNote.length();
        for(int i=0;i<len;i++){
            pChar=ransomNote.charAt(i);
            currentVal=fromMagazine.getOrDefault(pChar,0);
            if(currentVal==0)return false;
            fromMagazine.put(pChar,currentVal-1);
        }
        return true;
    }
}
