package From_17th_December;
import java.util.*;
public class RansomNote_SecondIteration {
    //Runtime: 84ms
    public boolean canConstruct(String ransomNote, String magazine) {
        LinkedList<String> note=new LinkedList<>(Arrays.asList(ransomNote.split("")));
        String[] mag=magazine.split("");
        for(String s:mag){
            note.remove(s);
            if(note.isEmpty())return true;
        }
        return false;
    }
}
