package February_2023;
import java.util.*;
public class FindAllAnagramsInA_String_OptimizedSolution {
    //Runtime: 4ms beats 99.13%, Memory: 43.4MB beats 41.22%
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> sol=new ArrayList<>();
        int lenS=s.length();
        int lenP=p.length();
        int[] forS=new int[26];
        int[] forP=new int[26];
        for(int i=0;i<lenP;i++) forP[p.charAt(i)-'a']++;
        for(int i=0;i<lenS;i++){
            forS[s.charAt(i)-'a']++;
            if (i + 1 >= lenP) {
                boolean set=true;
                for(int j=0;j<26;j++){
                    if(forS[j]!=forP[j]){
                        set=false;
                        break;
                    }
                }
                if(set)sol.add(i+1-lenP);
                forS[s.charAt(i+1-lenP)-'a']--;
            }
        }
        return sol;
    }
    public static void main(String...args){
        var got1=new FindAllAnagramsInA_String_OptimizedSolution().findAnagrams("cbaebabacd", "abc");
        System.out.println(got1);
        var got2=new FindAllAnagramsInA_String_OptimizedSolution().findAnagrams("abab","ab");
        System.out.println(got2);

    }
}
