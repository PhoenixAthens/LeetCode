package From_17th_December;
import java.util.*;
public class RansomNote_4thIteration {
    //Runtime: 18ms, beats 50.40%, Memory:43MB beats 81.9%
    public boolean canConstruct(String ransomNote, String magazine) {
        int lenR=ransomNote.length();
        int lenM=magazine.length();
        HashMap<Character,Integer> note=new HashMap<>();
        for(int i=0;i<lenM;i++){
            char present=magazine.charAt(i);
            if(note.containsKey(present)){
                note.put(present,note.get(present)+1);
            }else{
                note.put(present,1);
            }
        }

        HashMap<Character,Integer> boat=new HashMap<>();
        for(int i=0;i<lenR;i++){
            char present=ransomNote.charAt(i);
            if(boat.containsKey(present)){
                boat.put(present,boat.get(present)+1);
            }else{
                boat.put(present,1);
            }
        }
        for(int i=0;i<lenR;i++){
            char pChar=ransomNote.charAt(i);
            if(!note.containsKey(pChar))return false;
            else if(note.get(pChar)<boat.get(pChar))return false;
        }
        return true;

    }
}
