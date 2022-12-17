package From_17th_December;
import java.util.*;
public class RansomNote {
    //First Iteration
    //Runtime: 107ms beats 5.56%, Memory: 63.2MB beats 8.12%
    //Second Iteration
    //Runtime: 83ms beats 9.49% ,Memory: 46.3MB beats 56.90%
    public boolean canConstruct(String ransomNote, String magazine) {
        /*String[] note=ransomNote.split("");
        Arrays.parallelSort(note);

        Arrays.parallelSort(mag);
        int maxLen=note.length;
        String[] newOne=new String[maxLen];
        System.arraycopy(mag,0,newOne,0,maxLen);
        return Arrays.equals(newOne,note);*/
        ArrayList<String> note=new ArrayList<>(Arrays.asList(ransomNote.split("")));
        String[] mag=magazine.split("");
        for(String s:mag){
            note.remove(s);
            if(note.isEmpty())return true;
        }
        return false;
    }
    public static void main(String...args){
        System.out.println(new RansomNote().canConstruct("a","b"));
        System.out.println(new RansomNote().canConstruct("aa","ab"));
        System.out.println(new RansomNote().canConstruct("aa","aab"));

    }
}
