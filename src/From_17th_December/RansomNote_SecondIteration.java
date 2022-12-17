package From_17th_December;
import java.util.*;
public class RansomNote_SecondIteration {
    //Runtime: 174ms
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.equals(magazine))return true;
        else{
            int count=0;
            String[] note=ransomNote.split("");
            int len= note.length;;
            String[] mag=magazine.split("");
            for(int i=0;i<len;i++){
                String present=note[i];
                for(int j=0;j<mag.length;j++){
                    if(mag[j].equals(present)){
                        count++;
                        mag[j]="IQ";
                        break;
                    }
                }
            }
            return count==len;
        }
    }
}
