package February_2023;
import java.util.*;
//Date: 5th Feb, 2023
public class FindAllAnagramsInAString {
    //Time Limit Exceeded
    //Works for 34/64 solutions
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> findings=new ArrayList<>();
        int len1=s.length();
        int len2=p.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<len2;i++){
            char current=p.charAt(i);
            Integer val=map.get(current);
            if(val==null){
                map.put(current,1);
            }else{
                map.put(current,++val);
            }
        }
        for(int i=0;i<=len1-len2;i++){
            HashMap<Character,Integer> make=new HashMap<>(map);
            int j=i;
            for(; j < (i + len2); j++){
                char curr=s.charAt(j);
                Integer val=make.get(curr);
                if(val==null){
                    break;
                }
                else{
                    --val;
                    if(val==0)make.remove(curr);
                    else make.put(curr,--val);
                }

            }
            //System.out.println(make);
            if(j==i+len2){
                findings.add(i);
            }
        }
        return findings;
    }
    public static void main(String...args){
        var val1=new FindAllAnagramsInAString().findAnagrams("cbaebabacd","abc");
        var val2=new FindAllAnagramsInAString().findAnagrams("abab","ab");
        System.out.println(val1);
        System.out.println(val2);
    }
}
