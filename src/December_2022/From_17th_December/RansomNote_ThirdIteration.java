package December_2022.From_17th_December;
import java.util.HashMap;
public class RansomNote_ThirdIteration {
    //Runtime: 15ms beats 54.78%, Memory: 78.80MB beats 78.80%
    public boolean canConstruct(String ransomNote, String magazine) {
        int lenMAG=magazine.length();
        int lenRN=ransomNote.length();
        HashMap<Character,Integer> note=new HashMap<>();
        for(int i=0;i<lenMAG;i++){
            char present=magazine.charAt(i);
            if(note.containsKey(present)){
                note.put(present,note.get(present)+1);
            }else{
                note.put(present,1);
            }
        }
        for(int i=0;i<lenRN;i++){
            char pChar=ransomNote.charAt(i);
            if(note.containsKey(pChar)){
                int amount=note.get(pChar);
                if(amount==1)note.remove(pChar);
                else note.put(pChar,amount-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
